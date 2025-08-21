import java.util.Scanner;
public class assignment1_2task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input Fahrenheit:");
        double fah = reader.nextDouble();
        double celsius = (fah - 32) * 5 / 9;
        System.out.printf("Celsius is %.1f °C", celsius);

    }
}
