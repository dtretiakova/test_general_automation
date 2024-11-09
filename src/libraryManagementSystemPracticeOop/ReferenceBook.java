package libraryManagementSystemPracticeOop;

public class ReferenceBook extends Book{
    boolean referenceOnly;

    public ReferenceBook(String title, String author, BookStatus status, String isbn) {
        super(title, author, status, isbn);
        this.referenceOnly = false;
    }





}

