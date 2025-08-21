import java.util.Scanner;
public class Main {
    public static int getNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        String inputLine = scanner.nextLine();//scanner o day la bien chu thuong
        int value = Integer.parseInt(inputLine);
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] t = new int[5];//array named t

        for(int i =0; i< t.length; i++){
            t[i] = getNumber(input);
        }
        int[] temp = new int[10];
        for(int i =0; i< t.length; i++){
            temp[i] = t[i];
        }
        t=temp;
        for(int i =0; i< t.length; i++) {
            System.out.println(t[i]);
        }
    }
}