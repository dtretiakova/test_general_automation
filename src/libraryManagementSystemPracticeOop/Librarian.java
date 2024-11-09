package libraryManagementSystemPracticeOop;

public class Librarian{
    private String librarianFullName;
    private String password;


    public Librarian(String librarianFullName, String password) {
        this.librarianFullName = librarianFullName;
        this.password = password;
    }

    public String getLibrarianFullName() {
        return librarianFullName;
    }

    public String getPassword() {
        return password;
    }
}
