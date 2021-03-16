import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Strangers on a Train", "Patricia Highsmith", "crime");

    }

    @Test
    public void canCountBooksInStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }


}
