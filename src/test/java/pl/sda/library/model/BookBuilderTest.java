package pl.sda.library.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


// final zabrania nadpisywac

public final class BookBuilderTest {

    @Test
    public void shouldBuildBookWhenDetailsAreDefined(){
        // given
        String authorFirstName = "Jan";
        String authorLastName = "Sienkiewicz";
        String title = "w pustyni i w puszczy";
        // when
        Book book = new BookBuilder().authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .title(title)
                .build();

        //then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
    }
}
