package pl.sda.library.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AudioBookBuilderTest {

    @Test
    public void shouldBuildAudioBookWhenBookDetailsAreDefined() {
        //given
        String authorFirstName = "Henryk";
        String authorLastName = "Sienkiewicz";
        String title = "W pustyni i w puszczy";
        Format format = Format.MP3;
        //when
        AudioBook book = new AudioBookBuilder()
                .authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .title(title)
                .format(format)
                .build();
        //then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
        assertEquals(format, book.getFormat());
    }

}


