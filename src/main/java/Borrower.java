import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksOnLoan;

    public Borrower(){
        this.booksOnLoan = new ArrayList<Book>();
    }

    public int booksOnLoanCount(){
        return this.booksOnLoan.size();
    }

    public void addBook(Book book){
        this.booksOnLoan.add(book);
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.removeBook();
        booksOnLoan.add(book);
    }
}
