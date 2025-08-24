package Collecctions;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class ListItems {
    String item;
    double cost;
    String category;

    ListItems(String item, double cost, String category) {
        this.item = item;
        this.cost = cost;
        this.category = category;
    }
    @Override
    public String toString() {
        return String.format("Item: %s, Cost: %.2f, Category: %s", item, cost, category);
    }
    public static class CategorizingItems {
        HashMap<String, ListItems> categoryManage = new HashMap<>();

        public void addItem(String item, double cost, String category) {
            ListItems newItem = new ListItems(item, cost, category);
            categoryManage.put(item, newItem);
            System.out.println("Added");
        }

        public double calculate() {
            double total = 0;
            for (ListItems item : categoryManage.values()) {
                total += item.cost;
            }
            return total;
        }
        public void displayList() {
            int index = 1;
            for (Map.Entry<String, ListItems> entry : categoryManage.entrySet()) {
                System.out.printf("%d. %s \n", index++, entry.getValue());
            }
        }
        public void deleteItem(String item) {
            categoryManage.remove(item);
            System.out.println("Deleted");
        }
        public void checkItem(String checkItem) {
            boolean hasCheckItem = categoryManage.containsKey(checkItem);
            System.out.printf("Is \"%s\" in the grocery list? %b\n", checkItem, hasCheckItem);
            ListItems item = categoryManage.get(checkItem);
            System.out.printf("%s cost: %.2f\n", checkItem, item.cost);
            System.out.printf("Category: %s\n", item.category);
        }
        public static void main(String[] args) {
            CategorizingItems myList = new CategorizingItems();
            Scanner input = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Menu");
                    System.out.println("1. Add item");
                    System.out.println("2. Calculate");
                    System.out.println("3. Display all items");
                    System.out.println("4. Delete item");
                    System.out.println("5. Check item");
                    System.out.println("6. Exit");
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
                                System.out.printf("Item %d category: ", i + 1);
                                String category = input.nextLine();

                                myList.addItem(item, cost, category);
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
                        case 6:
                            System.out.println("Exit");
                            input.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter a number from 1 to 6.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter number from 1 to 6");
                    input.nextLine();
                }
            }
        }
    }
}





