package objektorientierungw3schools;

import java.util.ArrayList;

public class BookCollection {
    private ArrayList<Book> books;

    private Book book1;

    public BookCollection() {
        if (books == null) {
            books = new ArrayList<>();
        }
    }

    public ArrayList<Book> getInstance() {
        return books;
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        } else {
            throw new IllegalArgumentException("Books are null");
        }

    }

    public void removeBook(Book book) {
        if (book != null) {
            books.remove(book);
        }
    }
}
