import java.util.Scanner;
public class FindingTheMaximumSubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the integers into the array:");
        for (int i=0; i<size; i++) {
            System.out.printf("Enter integer %d: ", i+1);
            array[i] = input.nextInt();
        }
        //find sum
        int maximumSum = array[0];
        int startInt = 0;
        int endInt = 0;
        for(int i = 0; i< array.length; i++){
            int tempSum = 0;
            for(int j = i; j< array.length; j++) {
                tempSum += array[j];
                if(maximumSum < tempSum) {
                    maximumSum = tempSum;
                    startInt = i+1;
                    endInt = j+1;
                }
            }
        }
        System.out.printf("Maximum sum %d:\n", maximumSum);
        System.out.printf("Integers: %d - %d",startInt, endInt);
    }
}
