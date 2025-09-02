package ReadFileAndCalculate;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadColumn {
    private String fileUrl;
    private String column;
    private int rowCount = 0;

    public ReadColumn(String url, String column) {
        this.fileUrl = url;
        this.column = column;
    }

    public void readPrintColumn() {
        try {
            URL url = new URL(fileUrl);
            InputStream  inputStream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            int columnIndex = -1;//unknown

            // Take column
            if ((line = reader.readLine()) != null) {
                String[] headers = line.split(";");
                for (int i = 0; i < headers.length; i++) {
                    if (headers[i].trim().equalsIgnoreCase(column)) {
                        columnIndex = i;
                        break;
                    }
                }
            }
            if (columnIndex == -1) {
                System.out.println("Not found");
                return;
            }
            // readprint clomn
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                if (columnIndex < values.length) {
                    System.out.println(values[columnIndex]);
                    rowCount++;
                }
            }

            reader.close();
        } catch (Exception e) {
            System.err.println("Error url " + e.getMessage());
        }
        System.out.println("Total row: " + rowCount);
    }
}
