import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }


    public int stockCount() {
        return this.bookCollection.size();
    }

    public void addBook(Book book){
        this.bookCollection.add(book);
    }
}
