package pl.sda.library.command;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.sda.library.model.Cover;
import pl.sda.library.model.Library;
import pl.sda.library.model.Medium;
import pl.sda.library.model.Movie;
import pl.sda.library.model.MovieBuilder;
import pl.sda.library.model.PaperBook;
import pl.sda.library.model.PaperBookBuilder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class FilterByTypeCommandTest {



    private InputStream inputStream;
    @Before public void setUp() {
        inputStream = System.in;
        System.setIn(new ByteArrayInputStream("Movie\n".getBytes()));
    }


    @After public void tearDown() {
        System.setIn(inputStream);
    }



    @Test public void shouldDisplayMoviesWhenFilterByMovie() {
        // given
        PaperBook book = new PaperBookBuilder()//
                .authorFirstName("Henryk")//
                .authorLastName("Sienkiewicz")//
                .title("W pustyni i w puszczy")//
                .cover(Cover.HARD)//
                .pageCount(100)//
                .build();
        Movie movie1 = new MovieBuilder()//
                .title("W pustyni i w puszczy")//
                .directorFirstName("Andrzej")//
                .directorLastName("Wajda")//
                .duration(100)//
                .build();

        Movie movie2 = new MovieBuilder()//
                .title("Człowiek z marmuru")//
                .directorFirstName("Andrzej")//
                .directorLastName("Wajda")//
                .duration(120)//
                .build();

        Library<Medium> library = new Library<>();
        library.addMedium(book);
        library.addMedium(movie1);
        library.addMedium(movie2);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new FilterByTypeCommand(library, printStreamMock);

        // when
        command.execute();

        // then
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println(movie1);
        verify(printStreamMock, times(1)).println(movie2);
        verify(printStreamMock, never()).println(book);
    }

}