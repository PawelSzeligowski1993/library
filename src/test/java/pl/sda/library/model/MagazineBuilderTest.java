package pl.sda.library.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagazineBuilderTest {

    @Test
    public void shouldBuildMagazineWhenDataIsDefined()

    {
        //given
        String title = "Programista";
        int number = 64;
        int pageCount = 100;
        //when
        Magazine magazine = new MagazineBuilder()
                .title(title)//
                .number(number)//
                .pageCount(pageCount)//
                .build();
        //then
        assertNotNull(magazine);
        assertEquals(title, magazine.getTitle());
        assertEquals(number, magazine.getNumber());
        assertEquals(pageCount, magazine.getPageCount());

    }
}
