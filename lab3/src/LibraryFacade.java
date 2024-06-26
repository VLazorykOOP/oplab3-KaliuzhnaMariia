import java.util.ArrayList;
import java.util.List;

public class LibraryFacade {
    private List<Book> books;

    public LibraryFacade(){
        books = new ArrayList<>();
    }

    public void addBook(String name, String author, String genre, int pages, int year, boolean is_available){
        Book book = new Book.Builder().setName(name).setAuthor(author).setGenre(genre)
                .setPages(pages).setYear(year).setIs_available(is_available)
                .build();
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}
