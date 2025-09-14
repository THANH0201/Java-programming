package library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberID;
    private ArrayList<Book> borrowedBooks;
    private static int countID = 0;
    public LibraryMember(int memberID, String name) {
        this.name = name;
        this.memberID = memberID;
        countID++;
        borrowedBooks = new ArrayList<>();
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
    @Override
    public String toString() {
        return String.format("Members %s added.", memberID);
    }
}
