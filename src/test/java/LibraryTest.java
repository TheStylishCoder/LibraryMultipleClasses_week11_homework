import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Jane Eyre", "Charlotte Bronte", "romance");
        book2 = new Book("The Black Dahlia", "James Ellroy", "crime");
        book3 = new Book("Northern Lights", "Philip Pullman", "young fiction");
        book4 = new Book("Becoming", "Michelle Obama", "non-fiction");
        book5 = new Book("Pride and Prejudice", "Jane Austen", "romance");
        book6 = new Book("Strangers on a Train", "Patricia Highsmith", "crime");
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


    }

    @Test
    public void canCountBooksInStock(){
        assertEquals(4, library.stockCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book5);
        assertEquals(5, library.stockCount());
    }

    @Test
    public void cannotAddBookToStock(){
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.stockCount());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.removeBook();
        assertEquals(3, library.stockCount());
    }

}
