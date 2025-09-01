package reserved;

import reserved.model.Book;
import reserved.model.LibraryMember;
import reserved.system.Library;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        Library myLibrary = new Library();
        Book book = new Book("Book1", "Author1", "ISBN1");
        Book book2 = new Book("Book2", "Author2", "ISBN2");
        Book book3 = new Book("Book3", "Author3", "ISBN3");
        LibraryMember member = new LibraryMember(1, "A");
        LibraryMember member2 = new LibraryMember(2, "B");

        // Add books and members to the library
        myLibrary.addBooks(book);
        myLibrary.addBooks(book2);
        myLibrary.addBooks(book3);
        System.out.println(book.toString());

        myLibrary.addMembers(member);
        System.out.println(member.toString());
        myLibrary.addMembers(member2);
        System.out.println(member2.toString());

        // Perform borrowing and returning operations
        myLibrary.borrowBooks(member, book2);
        myLibrary.returnBooks(member,book3);

        // Create instances of library members, reserve/cancel books, display reserved books
        myLibrary.reserveBook(member, book);
        myLibrary.reserveBook(member, book2);
        myLibrary.reserveBook(member2,book3);
        myLibrary.cancelReservation(member, book);
        myLibrary.displayReservedBooks(member);
        myLibrary.displayReservedBooks(member2);
    }
}