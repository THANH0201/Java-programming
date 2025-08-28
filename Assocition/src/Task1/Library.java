package Task1;
import java.util.ArrayList;
import java.util.Scanner;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public ArrayList<Book> getBooks() {
        return books;
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

    }
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book1 = new Book("Introduction to Java Programming","John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.displayBooks();
        String  author = "Jane Doe";
        myLibrary.findBooksByAuthor(author);
        /*
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
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
            myLibrary.addBook(book);
        }
        myLibrary.displayBooks();
        System.out.println("Enter the Author:");
        String author2 = input.nextLine();
        myLibrary.findBooksByAuthor(author2);
        */
        }
    }

