import java.util.Scanner;
public class prime_number_generator {
    public static void main(String[] args) {
        System.out.println("enter two positive integers, start and end (where start < end):");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.printf("The primes between %d and %d is:\n", start, end);
        for (int i = start; i <= end; i++) {
            boolean prime = true;
            if (i > 2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            } else {
                prime = false;
            }
            if (prime) {
                System.out.printf("%d, ", i);
            }

        }
    }
}



