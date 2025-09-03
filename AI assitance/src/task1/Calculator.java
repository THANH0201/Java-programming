package task1;

public class Calculator {
    private int[] num;
    private int result;

    public Calculator(int[] num) {
        this.num = num;
        this.result = 0;
        //sum list, negative integers throw exception
        for (int n : num) {
            if (n < 0) {
                throw new IllegalArgumentException("Negative integers are not allowed");
            }
            result += n;
        }
        /*
        while (true) {
            try {
                for (int i = 0; i < num.length; i++) {
                    if (num[i] < 0) {
                        throw new IllegalArgumentException("Negative numbers not allowed: " + num[i]);
                    }
                    result += num[i];
                }
                break; // exit loop if successful
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                break; // exit loop on exception
            }
        }
     */
    }
    //reset the calculator to zero
    public void reset() {
        this.result = 0;
    }
    // add an integer to the calculator
    public void add(int n) {
        result += n;
    }
    // return the current value of the calculator
    public int getValue() {
        return result;
    }
    //main method to test the calculator
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Calculator calc = new Calculator(num);
        System.out.println("Initial value: " + calc.getValue());
        calc.add(5);
        System.out.println("After adding 5: " + calc.getValue());
        calc.reset();
        System.out.println("After reset: " + calc.getValue());
    }
}