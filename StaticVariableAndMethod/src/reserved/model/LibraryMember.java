package reserved.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberID;
    private List<Book> borrowedBooks;
    private List<Book> returnedBooks;
    private static int countID = 0;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(int memberID, String name) {
        this.name = name;
        this.memberID = memberID;
        countID++;
        borrowedBooks = new ArrayList<>();
        returnedBooks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMemberID() {
        return memberID;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(ArrayList<Book> book) {
        this.borrowedBooks = book;
    }
    public List<Book> getReturnedBooks() {
        return returnedBooks;
    }
    public int getCountID() {
        return countID;
    }
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
    @Override
    public String toString() {
        return String.format("Members %s added.", memberID);
    }
}
