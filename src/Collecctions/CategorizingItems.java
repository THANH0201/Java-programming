package Collecctions;
import java.util.*;
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
}
public class CategorizingItems {
    HashMap<String, List<ListItems>> categoryManage = new HashMap<>();
    HashMap<String, ListItems> itemLookup = new HashMap<>();

    public void addItem(String item, double cost, String category) {
        ListItems newItem = new ListItems(item, cost, category);
        categoryManage.computeIfAbsent(category, k -> new ArrayList<>()).add(newItem);
        itemLookup.put(item.toLowerCase(), newItem);
        //ListItems newItem = new ListItems(item, cost, category);
        //categoryManage.put(item, newItem);
        System.out.println("Added");
    }

    public double calculate() {
        double total = 0;
        for (List<ListItems> items : categoryManage.values()) {
            for (ListItems item : items) {
                total += item.cost;
            }
        }
        return total;
    }

    public void displayList() {
        int index = 1;
        for (Map.Entry<String, List<ListItems>> entry : categoryManage.entrySet()) {
            for (ListItems item : entry.getValue()) {
                System.out.printf("%d. %s \n", index++, item);
            }
        }
    }

    public void deleteItem(String item) {
        categoryManage.remove(item);
        System.out.println("Deleted");
    }

    public void displayByCategory(String category) {
        List<ListItems> items = categoryManage.get(category);
        System.out.printf("Items in category %s: ", category);
        for (ListItems item : items) {
            System.out.println(item);
        }
    }

    public void checkItem(String checkItem) {
        ListItems item = itemLookup.get(checkItem.toLowerCase());
        System.out.printf("\"%s\" in the list\n", checkItem);
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
                System.out.println("6. Display category");
                System.out.println("7. Exit");
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
                        System.out.println("Enter the name of category");
                        String category = input.nextLine();
                        myList.displayByCategory(category);
                        break;
                    case 7:
                        System.out.println("Exit");
                        input.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter a number from 1 to 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter number from 1 to 6");
                input.nextLine();
            }
        }
    }
}
