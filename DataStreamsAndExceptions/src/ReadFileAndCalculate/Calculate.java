package ReadFileAndCalculate;

import java.util.List;
public class Calculate {
    public static double calculateAverage(List<String> values) {
        double sum = 0;
        int count = 0;

        for (String value : values) {
            try {
                value = value.trim().replace(",", ".");
                double number = Double.parseDouble(value);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.err.println("Invalid: " + value);
            }
        }
        double average = sum / count;
        if (count > 0) {
            return average;
        } else {
            return 0;
        }

    }

}