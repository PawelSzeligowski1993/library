package pl.sda.library.model;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class LibraryTest {

    @Test
    public void shouldAddBookdWhenListOfBooksExsist(){
        //ngiven
        Library library = new Library();
        library.setBooks(new LinkedList<Book>());
        Book book = new Book();
        book.setTitle("w pustyni i w puszczy");
        // when
        library.addBook(book);
        // then
        Assert.assertEquals(Arrays.asList(book), library.getBooks());


    }


    @Test
    public void shouldAddBookdWhenListOfBooksIsNull(){
        //ngiven
        Library library = new Library();
        library.setBooks(new LinkedList<Book>());
        Book book = new Book();
        book.setTitle("w pustyni i w puszczy");
        // when
        library.addBook(book);
        // then
        Assert.assertEquals(Arrays.asList(book), library.getBooks());


    }
}
