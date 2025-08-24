package Collecctions;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GroceryListManager {
    ArrayList<String> groceryList = new ArrayList<>();
    public void addItem(String item) {
        groceryList.add(item);
        System.out.println("Added");
    }
    public void removeItem(String item) {
        groceryList.remove(item);
        System.out.println("Deleted");
    }
    public void displayGroceryList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, groceryList.get(i));
        }
    }
    public void checkItem(String checkItem) {
        boolean hasCheckItem = groceryList.contains(checkItem);
        System.out.printf("Is \"%s\" in the grocery list? %b\n", checkItem, hasCheckItem);
    }
    public static void main(String[] args) {
        GroceryListManager myList  = new GroceryListManager();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu");
                System.out.println("1. Add item");
                System.out.println("2. Delete item");
                System.out.println("3. Display all items");
                System.out.println("4. Check items");
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
                            myList.addItem(item);
                        }
                        System.out.println("Added");
                        break;
                    case 2:
                        System.out.print("Delete items: ");
                        String deleteItem = input.nextLine();
                        myList.removeItem(deleteItem);
                        break;
                    case 3:
                        System.out.println("📋 Grocery List:");
                        myList.displayGroceryList();
                        break;
                    case 4:
                        System.out.print("Check items: ");
                        String checkItem = input.nextLine();
                        myList.checkItem(checkItem);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter number from 1 to 4");
                input.nextLine();
            }
        }
    }
}





