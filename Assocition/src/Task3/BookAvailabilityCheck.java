package Task3;
import Task1.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookAvailabilityCheck {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int index = 1;
        for (Book book : books) {
            System.out.printf("%d. %s\n", index++, book);
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.printf("The books of Author \"%s\":\nTitle: %s, Year: %d", author, book.getTitle(), book.getYear());
            }
        }
        System.out.println("The book i not exist");
    }
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title.trim())) {
                books.remove(book);
                System.out.printf("Book %s have been borrowed successful\n", title);
                break;
            }
        }
        if (books.isEmpty()) {
            System.out.printf("Book %s is not exist\n", title);
        }
    }
    public void returnBook(Book book) {
        books.add(book);
        System.out.printf("Book '%s' was added into System", book);
    }
    public void isBookAvailable(String checkTitle) {
        boolean hasCheckBook = books.stream().anyMatch(book -> book.getTitle().equalsIgnoreCase(checkTitle.trim()));
        System.out.printf("Book '%s' is available? %b\n", checkTitle, hasCheckBook);
            }

    public static void main(String[] args) {
        BookAvailabilityCheck mySystem = new BookAvailabilityCheck();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. Display Books");
                System.out.println("3. Find Book by Author");
                System.out.println("4. Borrow Book");
                System.out.println("5. Return Book");
                System.out.println("6. Check Book Availability");
                System.out.println("7. Quit");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
                        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
                        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
                        mySystem.addBook(book1);
                        mySystem.addBook(book2);
                        mySystem.addBook(book3);
                        System.out.println("Book added successfully");
                        break;
                    /*    for (int i = 0; i < 3; i++) {
                            System.out.printf("Enter Book %d Title: ", i + 1);
                            String title = input.nextLine();
                            if (title.equalsIgnoreCase("ok")) {
                                break;
                            }
                            System.out.printf("Enter Book %d Author: ", i + 1);
                            String author1 = input.nextLine();
                            System.out.printf("Enter Book %d Public year: ", i + 1);
                            int year = Integer.parseInt(input.nextLine());
                            Book book = new Book(title, author1, year);
                            mySystem.addBook(book);
                            System.out.println("Book added successfully");
                            break;
                        }
                     */
                    case 2:
                        mySystem.displayBooks();
                        break;

                    case 3:
                        System.out.println("Enter the Author:");
                        String author = input.nextLine();
                        mySystem.findBooksByAuthor(author);
                        break;

                    case 4:
                        System.out.println("Which book do you want to borrow?:");//The Art of Fiction
                        String borrowTitle = input.nextLine();
                        mySystem.borrowBook(borrowTitle);
                        break;
                    case 5:
                        System.out.println("Enter title, author,public year of the book that you want to return?:");//The Art of Fiction
                        String returnTitle = input.nextLine();
                        String returnAuthor = input.nextLine();
                        int returnYear = Integer.parseInt(input.nextLine());
                        Book book = new Book(returnTitle, returnAuthor, returnYear);
                        mySystem.returnBook(book);
                        break;
                    case 6:
                        System.out.println("Which book do you want to check?:");
                        String checkTitle = input.nextLine();
                        mySystem.isBookAvailable(checkTitle);
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}





