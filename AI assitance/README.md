# Calculation Project

## Overview

This is a Java programming to sum positive integers.

## Features
A list of integers was provided. If negative integer existed in the list, program display warning. If not, the program calculates the sum of all positive integers in the list.  
Program display the current result.  
Allows adding an integer to the results.
Displays the final result.
Resets the result to zero.
## Methods
### Code
```
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
```
### Explanation
1. The `Calculator` class has a constructor that takes an array of integers as input. It initializes the `result` variable to zero and iterates through the array to sum the positive integers. If a negative integer is found, it throws an exception.
2. The `reset` method sets the `result` back to zero.
3. The `add` method allows adding a positive integer to the current result.
4. The `getValue` method returns the current value of the result.
5. The `main` method demonstrates how to use the `Calculator` class by creating an instance with a list of positive integers, adding a number, and resetting the result.



