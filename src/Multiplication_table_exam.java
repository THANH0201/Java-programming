import java.util.Scanner;
public class Multiplication_table_exam {
    public static void main(String[] args) {
        while (true) {
            int countPoint = 0;
            for (int i = 0; i < 10; i++) {
                int num1 = (int) (Math.random() * 10) + 1;
                int num2 = (int) (Math.random() * 10) + 1;
                System.out.println("Question is:\n");
                System.out.printf("%d x %d = ?", num1, num2);
                Scanner answer = new Scanner(System.in);
                int result = answer.nextInt();
                if (result == num1 * num2) {
                    boolean point = true;
                    countPoint++;
                    System.out.println("1p");
                } else {
                    boolean point = false;
                    System.out.println("0p");
                }
            }
            if (countPoint == 10) {
                System.out.printf("Bravoooo, you get %d points!", countPoint);
                break;
            }
            if (countPoint < 10) {
                System.out.printf("You get %d points!\n Try again!", countPoint);
            }
        }
    }
}



