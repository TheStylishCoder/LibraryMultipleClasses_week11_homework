import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
    }


    public int stockCount() {
        return this.bookCollection.size();
    }
}