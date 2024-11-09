package libraryManagementSystemPracticeOop;

import java.util.Random;

public class Member {
    private int memberId;
    private String fullName;
    private Book[] borrowedBooks;

    public Member(String fullName) {
        this.memberId = generateMemberId();
        this.fullName = fullName;
        this.borrowedBooks = borrowedBooks;
    }

    private int generateMemberId(){
        Random random = new Random();
        int randomId;
       do{
           randomId = random.nextInt(0, Integer.MAX_VALUE);
       } while (randomId == memberId);
        return memberId;
    }


    public int getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }


    public void addBorrowBook(Book book){
        for (int i = 0; i < borrowedBooks.length; i++) {
           if (borrowedBooks[i] == null){
               borrowedBooks[i] = book;
               break;
           }
        }

    }

    public void removeBorrowBook(){
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] != null){
                borrowedBooks[i] = null;
            }
        }
    }
}
