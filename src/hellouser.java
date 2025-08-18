import java.util.Scanner;
public class hellouser {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("what your name?");
        String name = reader.nextLine();
        System.out.print("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        //double x = Double.parseDouble(reader.nextLine());
        //boolean x = Boolean.parseBoolean(reader.nextLine());
        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }
}
