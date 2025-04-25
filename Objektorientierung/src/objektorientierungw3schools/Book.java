package objektorientierungw3schools;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private long isbnNumber;


    public Book(String title, String author, long isbnNumber) {
        this.title = title;
        this.author = author;
        this.isbnNumber = isbnNumber;

    }
    public Book(){}
    public String getTitle() {
        return title;

    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public long getIsbnNumber() {
        return isbnNumber;

    }
    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbnNumber == book.isbnNumber && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbnNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + title + "\n");
        sb.append("Author: " + author + "\n");
        sb.append("ISBN Number: " + isbnNumber + "\n");
        return sb.toString();
    }


}
