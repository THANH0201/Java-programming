import java.util.Scanner;
public class Array_task1_fullNameRandom {
    public static void main(String[] args) {
        String[] firstNames = {
                "Nguyen", "Kohonen", "Mäkinen", "Laine", "Järvinen", "Koskinen", "Nieminen"
        };
        String[] lastNames ={
                "Thanh", "Jenni", "Aino", "Sari", "Tuula", "Mikko", "Tapio", "Lauri", "Kalevi"
        };
        while(true) {
            try {
                System.out.println("How many full name do you want to create?");
                Scanner input = new Scanner(System.in);
                int num = input.nextInt();
                System.out.printf("These are %d full names:\n", num);
                for (int i = 0; i < num; i++) {
                    String firstName = firstNames[(int) (Math.random() * firstNames.length)];
                    String lastName = lastNames[(int) (Math.random() * lastNames.length)];
                    System.out.printf("%s %s\n", firstName, lastName);
                }
            } catch (Exception e) {
                System.out.println("Try later");
                break;
            }

        }
    }
}
