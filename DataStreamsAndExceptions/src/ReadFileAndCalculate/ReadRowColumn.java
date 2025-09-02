package ReadFileAndCalculate;

import java.io.*;
import java.net.*;
import java.util.*;

public class ReadRowColumn {
    private final String fileUrl;
    private final String row;
    private final String column;
    private static int counter = 0;
    private final List<String> extractedValues = new ArrayList<>();

    public ReadRowColumn(String fileUrl, String row, String column) {
        this.fileUrl = fileUrl;
        this.row = row;
        this.column = column;
    }

    public void findAndExport(String outputFileName) {
        try {
            URL url = new URL(fileUrl);
            try (
                    InputStream inputStreamReader = url.openStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStreamReader))
            ) {
                String line;
                String[] headers = null;
                int columnIndex = -1;

                while ((line = reader.readLine()) != null) {
                    String[] cells = line.split(";");

                    // Lấy tiêu đề cột
                    if (headers == null) {
                        headers = cells;
                        for (int i = 0; i < headers.length; i++) {
                            if (headers[i].equalsIgnoreCase(column)) {
                                columnIndex = i;
                                break;
                            }
                        }
                        continue;
                    }

                    // row: tìm tất cả dòng bắt đầu bằng ngày
                    if (cells.length > 0 && cells[0].startsWith(row)) {
                        if (columnIndex != -1 && columnIndex < cells.length) {
                            extractedValues.add(cells[columnIndex]);
                        }
                    }
                }

                // Ghi ra file nếu có giá trị
                if (!extractedValues.isEmpty()) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                        for (String value : extractedValues) {
                            writer.write(value);
                            writer.newLine();
                            counter++;
                        }
                    }
                } else {
                    System.err.println("Không tìm thấy giá trị phù hợp.");
                }
                System.out.println("Total row: " + counter);
            }
        } catch (IOException e) {
            System.err.println("Lỗi xử lý: " + e.getMessage());
        }
    }
    public List<String> getExtractedValues() {
        return extractedValues;
    }
}