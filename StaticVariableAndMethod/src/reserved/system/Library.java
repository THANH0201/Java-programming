package reserved.system;

import reserved.model.Book;
import reserved.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books =  new ArrayList<>();
    List<LibraryMember> members = new ArrayList<>();

    public void addBooks(Book book) {
        books.add(book);
    }
    public void addMembers(LibraryMember member) {
        members.add(member);
    }
    public void borrowBooks(LibraryMember member, Book book) {
        if (!members.contains(member)) {
            System.out.println("Invalid member");
            return;
        }
        if (!books.contains(book)) {
            System.out.println("Book not available in library");
            return;
        }
        if (book.isReserved()) {
            System.out.println("Book " + book.getTitle() + " is reserved.");
            return;
        }
        books.remove(book);
        member.getBorrowedBooks().add(book);
        System.out.println("Book " + book.getTitle() + " borrowed by member " + member.getMemberID());
    }

    public void returnBooks(LibraryMember member, Book book) {
        if (!members.contains(member)) {
            System.out.println("Invalid member");
            return;
        }

        if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("Invalid book");
            return;
        }
        member.getBorrowedBooks().remove(book);
        books.add(book);
        System.out.println("Book " + book.getTitle() + " returned");

    }
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book "+book.getTitle()+" reserved successfully.");
        } else {
            System.out.println("Book "+book.getTitle()+" is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book " + book.getTitle()+ " was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}


