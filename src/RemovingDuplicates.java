import java.util.Scanner;
public class RemovingDuplicates {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = input.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the integers into the array:");
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter integer %d: ", i + 1);
                array[i] = input.nextInt();
            }
            //remove duplicates
            int[] newArray = new int[array.length];
            int num = 0;
            for (int i = 0; i < array.length; i++) {
                int j;
                for ( j = 0; j < num; j++) {
                    if (array[i] == newArray[j]) {
                        break;
                    }
                }
                if(j == num) {
                    newArray[j] = array[i];
                    num++;
                }
            }
            System.out.println("The array without duplicates:");
            for (int i = 0; i < num; i++) {
                System.out.printf("%d ",newArray[i]);
            }
        }
    }


