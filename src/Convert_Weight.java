import java.util.Scanner;
public class Convert_Weight {
    public static void main(String[] args) {
        System.out.println("Enter weight in grams:");
        Scanner input = new Scanner(System.in);
        int gram = input.nextInt();
        double luoti = gram / 13.28;
        int noula = (int)(luoti / 32);
        int leiviskä = (noula / 20);
        System.out.println("Weight (g): " + gram);
        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti.",gram,leiviskä,noula,luoti);
    }

}
