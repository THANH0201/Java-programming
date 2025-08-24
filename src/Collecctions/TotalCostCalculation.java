package Collecctions;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
public class TotalCostCalculation {
    HashMap<String,Double> costCalculation = new HashMap<>();
    public void addItem(String item, double cost) {
        costCalculation.put(item,cost);
        System.out.println("Added");
    }
    public double calculate() {
        double total = 0;
        for (double cost : costCalculation.values()) {
            total += cost;
        }
        return total;

    }
    public void displayList() {
        int index = 1;
        for (Map.Entry<String, Double> entry : costCalculation.entrySet()) {
            System.out.printf("%d. %s - %.2f\n", index++, entry.getKey(), entry.getValue());
        }
    }
    public void deleteItem(String item) {
        costCalculation.remove(item);
        System.out.println("Deleted");
    }
    public void checkItem(String checkItem) {
        boolean hasCheckItem = costCalculation.containsKey(checkItem);
        System.out.printf("Is \"%s\" in the grocery list? %b\n", checkItem, hasCheckItem);
        System.out.printf("%s cost: %.2f\n", checkItem, costCalculation.get(checkItem));
    }

    public static void main(String[] args) {
        TotalCostCalculation myList  = new TotalCostCalculation();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu");
                System.out.println("1. Add item");
                System.out.println("2. Calculate");
                System.out.println("3. Display all items");
                System.out.println("4. Delete item");
                System.out.println("5. Check item");
                System.out.println("Enter task: ");
                int task = input.nextInt();
                input.nextLine();
                switch (task) {
                    case 1:
                        System.out.print("Add maximum 5 items, enter ok if done:\n");
                        for (int i = 0; i < 5; i++) {
                            System.out.printf("Item %d: ", i + 1);
                            String item = input.nextLine();
                            if (item.equalsIgnoreCase("ok")) {
                                break;
                            }
                            System.out.printf("Item %d cost: ", i + 1);
                            double cost = input.nextDouble();
                            input.nextLine();
                            myList.addItem(item,cost);
                        }
                        System.out.println("Added");
                        break;
                    case 2:
                        System.out.printf("Calculate cost: %.2f\n", myList.calculate());
                        break;
                    case 3:
                        System.out.println("📋 Grocery List:");
                        myList.displayList();
                        break;
                    case 4:
                        System.out.println("Delete item");
                        String deleteItem = input.nextLine();
                        myList.deleteItem(deleteItem);
                        break;
                    case 5:
                        System.out.println("Check item");
                        String checkItem = input.nextLine();
                        myList.checkItem(checkItem);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter number from 1 to 5");
                input.nextLine();
            }
        }
    }
}





