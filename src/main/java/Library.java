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
        if(this.stockCount() < this.capacity){
            this.bookCollection.add(book);
        }
    }

    public Book removeBook(){
        return this.bookCollection.remove(0);
    }

    public ArrayList<String> getGenres(){
        ArrayList<String> genres = new ArrayList<String>();
        for(Book book : bookCollection){
            String genre = book.getGenre();
            genres.add(genre);
        }
        return genres;

    }
}
