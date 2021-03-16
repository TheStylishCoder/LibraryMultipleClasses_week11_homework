import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Jungle Book", "Rudyard Kipling", "fiction");
    }

    @Test
    public void canGetGenre(){
        assertEquals("fiction", book.getGenre());
    }
}
