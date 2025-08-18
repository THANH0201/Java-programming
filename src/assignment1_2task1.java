import java.util.Scanner;
public class assignment1_2task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input Fahrenheit:");
        double fah = reader.nextDouble();
        System.out.printf("Celsius is %.1f",(fah -32)*5/9 );

    }
}
