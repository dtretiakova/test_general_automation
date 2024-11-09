package libraryManagementSystemPracticeOop;

public class Book {
    private String title;
    private String author;
    private BookStatus status;
    private String isbn;

    public Book(String title, String author, BookStatus status, String isbn) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status){
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

}
