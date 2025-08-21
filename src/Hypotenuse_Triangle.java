import java.util.Scanner;
public class Hypotenuse_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the lengths of the legs of a right triangle:");
        Scanner input = new Scanner(System.in);
        double leg1 = input.nextDouble();
        double leg2 = input.nextDouble();
        double hypotenuse = Math.sqrt((leg1*leg1)+(leg2*leg2));
        System.out.printf("The hypotenuse is %.2f",hypotenuse);
    }
}
