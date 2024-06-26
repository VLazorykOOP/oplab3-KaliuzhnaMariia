import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {
    private List<Book> books;
    private int position;

    public BookIterator(List<Book> books){
        this.books = books;
        this.position = position;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        return books.get(position++);
    }
}
