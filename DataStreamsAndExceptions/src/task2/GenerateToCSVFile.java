package task2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateToCSVFile {
    public static List<String> generateFibonacci(long numStart, long numEnd, int total) {
        List<String> fibonaccis = new ArrayList<>();
        for (int i = 0; i <= total; i++) {
            fibonaccis.add(String.valueOf(numStart));
            long next = numStart + numEnd;
            numStart = numEnd;
            numEnd = next;
        }
        return fibonaccis;
    }

    public void readWrite(List<String> fibonaccis) {
        String fileName = "GeneralFibonacci.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Index,Fibonacci\n");
            for (int i = 0; i < fibonaccis.size(); i++) {
                writer.write((i) + ":" + fibonaccis.get(i) + "\n");
            }
            System.out.println("CSV file written successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        GenerateToCSVFile generator = new GenerateToCSVFile();
        List<String> fibonaccis = generateFibonacci(0,1,60);
        generator.readWrite(fibonaccis);
    }
}
