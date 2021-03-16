import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("The Jungle Book", "Rudyard Kipling", "fiction");
        library = new Library(20);
        library.addBook(book);
    }

    @Test
    public void canCountBooksOnLoan(){
        assertEquals(0, borrower.booksOnLoanCount());
    }

    @Test
    public void canAddBookToLoanList(){
        borrower.addBook(book);
        assertEquals(1,borrower.booksOnLoanCount() );
    }

    @Test
    public void canBorrowABookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.booksOnLoanCount());
    }
}
