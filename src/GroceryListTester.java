import java.util.*;

class ListItems1 {
    String item;
    double cost;
    String category;
    int quantity;

    ListItems1(String item, double cost, String category, int quantity) {
        this.item = item;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return String.format("Item: %s, Cost: %.2f, Category: %s , Quantity: %d", item, cost, category, quantity);
    }
}
public class GroceryListTester {
    HashMap<String, List<ListItems1>> categoryManage = new HashMap<>();
    HashMap<String, ListItems1> itemLookup = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        ListItems1 newItem = new ListItems1(item, cost, category, quantity);
        categoryManage.computeIfAbsent(category, k -> new ArrayList<>()).add(newItem);
        itemLookup.put(item.toLowerCase(), newItem);
        //ListItems newItem = new ListItems(item, cost, category);
        //categoryManage.put(item, newItem);
        System.out.println("Added");
    }
    public void updateQuantity(String item, int newQuantity) {
        ListItems1 foundItem = itemLookup.get(item.toLowerCase());
        if (foundItem != null) {
            foundItem.quantity = newQuantity;
            System.out.printf("Updated quantity of \"%s\" to %d\n", item, newQuantity);
        } else {
            System.out.printf("Not found \"%s\"\n", item);
        }
    }
    public void displayAvailableItems(int quantity) {
        int index = 1;
        for (ListItems1 item : itemLookup.values()) {
            if (item.quantity > quantity) {
                System.out.printf("%d. %s\n", index++, item);
            }
        }
        if (index == 1) {
            System.out.println("Items run out.");
        }
    }

    public double calculate() {
        double total = 0;
        for (List<ListItems1> items : categoryManage.values()) {
            for (ListItems1 item : items) {
                total += (item.cost * item.quantity);
            }
        }
        return total;
    }
    public void displayList() {
        int index = 1;
        for (Map.Entry<String, List<ListItems1>> entry : categoryManage.entrySet()) {
            for (ListItems1 item : entry.getValue()) {
                System.out.printf("%d. %s \n", index++, item);
            }
        }
    }
    public void deleteItem(String item) {
        categoryManage.remove(item);
        System.out.println("Deleted");
    }
    public void displayByCategory(String category) {
        List<ListItems1> items = categoryManage.get(category);
        System.out.printf("Items in category %s: ", category);
        for (ListItems1 item : items) {
            System.out.println(item);
        }
    }
    public void checkItem(String checkItem) {
        ListItems1 item = itemLookup.get(checkItem.toLowerCase());
        System.out.printf("\"%s\" in the list\n", checkItem);
        System.out.printf("%s cost: %.2f\n", checkItem, item.cost);
        System.out.printf("Category: %s\n", item.category);
    }
    public static void main(String[] args) {
        GroceryListTester myList = new GroceryListTester();
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
                System.out.println("7. Display available items");
                System.out.println("8. Update quantity");
                System.out.println("9. Exit");
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
                            double cost = Double.parseDouble(input.nextLine());
                            System.out.printf("Item %d category: ", i + 1);
                            String category = input.nextLine();
                            System.out.printf("Item %d quantity: ", i + 1);
                            int quantity = Integer.parseInt(input.nextLine());
                            myList.addItem(item, cost, category,quantity);
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
                        System.out.println("Enter category");
                        String category = input.nextLine();
                        myList.displayByCategory(category);
                        break;
                    case 7:
                        System.out.println("Enter the quantity to display: ");
                        int  quantity = input.nextInt();
                        System.out.println("Available items:\n ");
                        myList.displayAvailableItems(quantity);
                        break;
                    case 8:
                        System.out.println("Enter item:");
                        String item = input.nextLine();
                        System.out.println("Enter new quantity: ");
                        int newQuantity = input.nextInt();
                        myList.updateQuantity(item, newQuantity);
                        break;
                    case 9:
                        System.out.println("Exit");
                        input.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter a number from 1 to 8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter number from 1 to 8");
                input.nextLine();
            }
        }
    }
}



