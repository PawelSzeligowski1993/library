package pl.sda.library.model;


import com.sun.org.apache.xerces.internal.xs.LSInputList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Library {

    private List<Book>books;


    public List<Book> getBooks() {
        //books = new LinkedList<>();
        return Collections.unmodifiableList(books);
    }

    public void setBooks(List<Book> books) {
        this.books = new LinkedList<>(books);
    }

    public void addBook(Book book){
        if(books == null){
            books = new LinkedList<>();
        }
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
