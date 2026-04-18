package complextasks.booklibrary;

public class BookProxy {
    private Book book;
    private Book.BookBuilder bookBuilder;

    public BookProxy(Book.BookBuilder builder) {
        this.bookBuilder = builder;
    }

    public void readBook() {
        if (book == null) {
            book = new Book(bookBuilder);
        }
        book.read();
    }

    public String getContent() {
        if (book == null) {
            book = new Book(bookBuilder);
        }
        return book.getContent();
    }
}
