package ReadFileAndCalculate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        //ReadFileAndCalculate.ReadColumn column = new ReadFileAndCalculate.ReadColumn(url,"UlkoTalo");
        //column.readPrintColumn();
        //ReadFileAndCalculate.ReadCSVFile reader = new ReadFileAndCalculate.ReadCSVFile(url);
        //reader.readPrint();
        String row = "01.01.2023";
        String column = "UlkoTalo";
        ReadRowColumn read = new ReadRowColumn(url,row,column);
        read.findAndExport("temp.txt");
        List<String> extractedValues = read.getExtractedValues();
        double average = Calculate.calculateAverage(extractedValues);
        System.out.printf("the average temperature for the 1st day of January 2023 is: %.2f°C ",average);



    }
}

