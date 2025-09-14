package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    ArrayList<Book> books =  new ArrayList<>();
    ArrayList<LibraryMember> members = new ArrayList<>();
    public void addBooks(Book book) {
        books.add(book);
    }
    public void addMembers(LibraryMember member) {
        members.add(member);
    }
    public void borrowBooks(LibraryMember member,Book book) {
        if (members.contains(member) && books.contains(book)) {
            books.remove(book);
            member.getBorrowedBooks().add(book);
            System.out.println("Books " + book.getTitle() + " borrowed");
        }else {
            System.out.println("Invalid member");
        }
    }
    public void returnBooks(LibraryMember member,Book book) {
        if (members.contains(member) && members.contains(book)) {
            books.add(book);
            member.getBorrowedBooks().remove(book);
            System.out.println("Book " + book + " returned");
        } else {
            System.out.println("Invalid book");
        }
    }
}


