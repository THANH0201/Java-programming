import java.util.Scanner;
public class assignment1_3_task1 {
    public static void main(String[] args) {
        System.out.println("Enter the coefficients of a quadratic equation (ax^2 + bx + c = 0)");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int delta = b*b - 4*a*c;
        //System.out.println("The delta is "+delta);
        if (delta<0){
            System.out.println("The equation has no solution");
        }
        if (delta > 0){
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("The equation has solution x1 = " + x1 + ", x2= " + x2);
        }
        if (delta == 0) {
            double x3 = (-b /(2*a));
            System.out.println("The equation has solution x1 = x2 = " + x3);
        }
    }
}
