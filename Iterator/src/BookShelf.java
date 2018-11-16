import java.util.ArrayList;

public class BookShelf implements Aggregate{
    private ArrayList<Book> books;
    private int last = 0;
    public BookShelf(int initialize){
        books = new ArrayList(initialize);
    }
    public Book getBooksAt(int index){
        return books.get(index);
    }
    public void appendBook(Book book){
        books.add(book);
    }
    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
