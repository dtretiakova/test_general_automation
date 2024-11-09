package libraryManagementSystemPracticeOop;

import java.util.Random;

public class Library {
    private Book[] books = new Book[10];
    private Member[] members = new Member[10];

    public Library() {
        this.books = addBookToLibrary();
    }

    public Book[] getBooks() {
        return books;
    }

    private Book[] addBookToLibrary() {
        Book aliceInWonderland = new Book("Alice in Wonderland", "Charles Lutwidge", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book tomSawyer = new Book("Tom Sawyer", "Mark Twain", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book theGreatGatsby = new Book("The Great Gatsby", "Scott Fitzgerald", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book coreJava = new Book("Core Java", "Cay Horstmann", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book theDetectiveDog = new Book("The Detective Dog", "Julia Donaldson", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book cinderella = new Book("Cinderella", "Charles Perrault", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book theYellowBus = new Book("The Yellow Bus", "Loren Long", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book thePerfectCouple = new Book("The Perfect Couple", "Elin Hilderbrand", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book longIslandCompromise = new Book("Long Island Compromise", "Taffy Brodesser-Akner", BookStatus.AVAILABLE, randomizerOfIsbn());
        Book harryPotter = new Book("Harry Potter", "John Rowling", BookStatus.AVAILABLE, randomizerOfIsbn());

        books[0] = aliceInWonderland;
        books[1] = tomSawyer;
        books[2] = theGreatGatsby;
        books[3] = coreJava;
        books[4] = theDetectiveDog;
        books[5] = cinderella;
        books[6] = theYellowBus;
        books[7] = thePerfectCouple;
        books[8] = longIslandCompromise;
        books[9] = harryPotter;

        return books;
    }


    public void removeBook(String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsbn().equals(isbn) && books[i].getStatus().equals(BookStatus.AVAILABLE)) {
                books[i] = null;
                break;
            }
        }
    }

    public boolean libraryIsFull() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return false;
            }
        }
        return true;
    }


    public void addBook(Book newBook) {
        if (libraryIsFull()) {
            Book[] copyBooks = new Book[books.length + 5];
            for (int i = 0; i < books.length; i++) {
                copyBooks[i] = books[i];
            }
            books = copyBooks;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }
        }
    }

    public String randomizerOfIsbn() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 12; i++) {
            sb.append(random.nextInt(0, Integer.MAX_VALUE));
        }
        return sb.toString();
    }

    public void borrowBooks(Book borrowBook, Member member) {
        for (int i = 0; i < getBooks().length; i++) {
            if (borrowBook.equals(books[i]) && BookStatus.AVAILABLE.equals(books[i].getStatus())) {
                books[i].setStatus(BookStatus.CHECKED_OUT);
                member.addBorrowBook(books[i]);
            } else {
                System.out.println("Sorry, this book is not available");
            }

        }
    }

    public void returnBook(Book borrowBook, Member member) {
        for (int i = 0; i < getBooks().length; i++) {
            if (borrowBook.equals(books[i])){
                member.removeBorrowBook();
                System.out.println("You are done. Thanks for returning " + books[i].toString());
                books[i].setStatus(BookStatus.AVAILABLE);
            }
        }

    }




    public void addMember(Member newMember) {
        if (libraryIsFull()) {
            Member[] copyMember = new Member[members.length + 5];
            for (int i = 0; i < books.length; i++) {
                copyMember[i] = members[i];
            }
            members = copyMember;
        }
    }

    public boolean memberIsFull() {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                return false;
            }
        }
        return true;
    }



}
