package pl.sda.library.model;



import org.junit.Test;



import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;



public class MovieBuilderTest {



    @Test public void shouldBuildMovieWhenAllDataIsDefined() {

        // given

        String title = "Przeminęło z wiatrem";

        String directorFirstName = "John";

        String directorLastName = "Smith";

        int duration = 1000;

        // when

        Movie movie = new MovieBuilder()//

                .title(title)//

                .directorFirstName(directorFirstName)//

                .directorLastName(directorLastName)//

                .duration(duration)//

                .build();

        // then

        assertNotNull(movie);

        assertEquals(title, movie.getTitle());

        assertNotNull(movie.getDirector());

        assertEquals(directorFirstName, movie.getDirector().getFirstName());

        assertEquals(directorLastName, movie.getDirector().getLastName());

        assertEquals(duration, movie.getDuration());

    }



}