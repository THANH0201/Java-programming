package Task2;

import Task1.Book;
import Task1.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class BorrowSystem {
    private Library myLibrary = new Library();

    public void borrowBook(String title) {
        ArrayList<Book> books = myLibrary.getBooks();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
            }
        }
        System.out.printf("Book %s was borrowed\n", title);
    }

    public void returnBook(Book book) {
        myLibrary.addBook(book);
        System.out.printf("Book '%s' was added into System",book);
    }

    public static void main(String[] args) {
        BorrowSystem mySystem = new BorrowSystem();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Borrow Book");
                System.out.println("2. Return Book");
                System.out.println("4. Quit");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Which book do you want to borrow?:");//The Art of Fiction
                        String borrowTitle = input.nextLine();

                        mySystem.borrowBook(borrowTitle);
                        break;
                    case 2:
                        System.out.println("Enter title, author,public year of the book that you want to return?:");//The Art of Fiction
                        String returnTitle = input.nextLine();
                        String returnAuthor = input.nextLine();
                        int returnYear = Integer.parseInt(input.nextLine());
                        Book book = new Book(returnTitle, returnAuthor, returnYear);
                        mySystem.returnBook(book);
                        break;
                    case 3:
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








