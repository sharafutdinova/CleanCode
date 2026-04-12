package complextasks.booklibrary;

public class Book {
    private String name;
    private String description;
    private String author;
    private String content;
    private String pathToCover;

    public Book(String name, String description, String author, String content, String pathToCover) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.content = content;
        this.pathToCover = pathToCover;
    }

    public Book(BookBuilder bookBuilder) {
        this.name = bookBuilder.name;
        this.description = bookBuilder.description;
        this.author = bookBuilder.author;
        this.content = bookBuilder.content;
        this.pathToCover = bookBuilder.pathToCover;
    }

    public void read() {
        System.out.println("Book " + this.name + " " + this.author + " is reader.");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", pathToCover='" + pathToCover + '\'' +
                '}';
    }

    static class BookBuilder {
        private String name;
        private String description;
        private String author;
        private String content;
        private String pathToCover;

        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public BookBuilder setPathToCover(String pathToCover) {
            this.pathToCover = pathToCover;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
