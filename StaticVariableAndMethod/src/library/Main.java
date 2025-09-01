package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        Library myLibrary = new Library();
        Book book = new Book("Book1", "Author1", "ISBN1");
        LibraryMember member = new LibraryMember(1, "A");

        // Add books and members to the library
        myLibrary.addBooks(book);
        System.out.println(book.toString());

        myLibrary.addMembers(member);
        System.out.println(member.toString());

        // Perform borrowing and returning operations
        myLibrary.borrowBooks(member, book);
        myLibrary.returnBooks(member,book);
    }
}