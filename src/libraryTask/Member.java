package libraryTask;

public class Member {
    String name;
    Book[] borrowedBooks;
    int count = 0;

    public Member(String name){
        this.name = name;
        borrowedBooks = new Book[10];
    }
    public void borrowedBook(Book book){
        borrowedBooks[count] = book;
        count++;
    }
}
