package Collecctions;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GroceryListManager {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
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
                            groceryList.add(item);
                        }
                        System.out.println("Added");
                        break;
                    case 2:
                        System.out.print("Delete items: ");
                        String deleteItem = input.nextLine();
                        if (groceryList.remove(deleteItem)) {
                            System.out.println("Deleted " + deleteItem);
                        } else {
                            System.out.println("The item is not found");
                        }
                        break;
                    case 3:
                        System.out.println("📋 Grocery List:");
                        for (int i = 0; i < groceryList.size(); i++) {
                            System.out.printf("%d. %s\n", i + 1, groceryList.get(i));
                        }
                        break;
                    case 4:
                        System.out.print("Check items: ");
                        String checkItem = input.nextLine();
                        boolean hasCheckItem = groceryList.contains(checkItem);
                        System.out.printf("Is \"%s\" in the grocery list? %b\n", checkItem, hasCheckItem);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter number from 1 to 4");
                input.nextLine();
            }
        }
    }
}





