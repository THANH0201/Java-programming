package ReadFileAndCalculate;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {
    private final String fileUrl;
    private int rowCount = 0;
    private List<String> data = new ArrayList<>();

    public ReadCSVFile(String url) {
        this.fileUrl = url;
    }

    //read all file
    public void readPrint() {
        String line;
        String[] columnNames = new String[0];
        boolean header = true;
        try {
            URL url = new URL(fileUrl);
            try (
                InputStream inputStream = url.openStream();
                BufferedReader bufferedstream =new BufferedReader(new InputStreamReader(inputStream));
            //openfile
                BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            ) {
                while ((line = bufferedstream.readLine()) != null) {
                    data.add(line);
                    if (header) {
                        columnNames = line.split(";");
                        header = false;
                    } else {
                        String[] columns = line.split(";");
                        //for (int i = 0; i < columnNames.length && i < columns.length; i++) {
                        //    System.out.print(columnNames[i] + ": " + columns[i] + ", ");
                        //}
                        StringBuilder outLine = new StringBuilder();
                        for (int i = 0; i < columnNames.length && i < columns.length; i++) {
                            outLine.append(columnNames[i]).append(": ").append(columns[i]);
                            if (i < columnNames.length - 1 && i < columns.length - 1) {
                                outLine.append(", ");
                            }
                        }
                        writer.write(outLine.toString());
                        writer.newLine(); // xuống dòng sau khi ghi xong toàn bộ dòng
                        //System.out.println();
                        rowCount++;
                    }
                }
                System.out.println("Total row: " + rowCount);
                System.out.println("Written file data.txt");
            }
        } catch (IOException e) {
            System.err.println("Error from URL: " + e.getMessage());
        }
    }
}