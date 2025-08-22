import java.util.Scanner;
public class assignment1_3_task2 {
    public static void main(String[] args) {
        while(true) {
            System.out.println("enter your binary number:");
            Scanner input = new Scanner(System.in);
            String binary = input.nextLine();
            int binlen = binary.length();
            int decimal = 0;
            for (int i = 0; i < binlen; i++) {
                int number = (binary.charAt(i) - '0') * (int) Math.pow(2, (binlen -1 - i));
                decimal += number;
            }
            System.out.printf("The number in decimal is %d:\n", decimal);

            break;
        }
    }
}
