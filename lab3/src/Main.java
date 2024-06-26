import java.util.List;
public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();

        library.addBook("Harry Potter", "J.K. Rowling", "Fantasy", 223,1997, true);
        library.addBook("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1200,1954, false);
        library.addBook("Portrait of Dorian Grey", "Oscar Wilde", "Philosophical fiction", 304, 1890, false);
        library.addBook("101 Dalmatians", "Dodie Smith", "Children's novel", 384, 1956, true);
        library.addBook("13th Tale", "Diane Setterfield", "Gothic fiction", 406, 2006, true);
        library.addBook("The Sorrows of Satan", "Marie Corelli", "Gothic novel", 324, 1895, false);

        List<Book> books = library.getBooks();
        BookIterator iterator = new BookIterator(books);

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}