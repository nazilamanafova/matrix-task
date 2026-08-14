package libraryTask;

public class Shelf {
    String code;
   Book[] books;
   int count = 0;

    public Shelf(String code){
        this.code = code;
        books = new Book[10];
    }
    public void addBook(Book book){
        books[count] = book;
        count++;
    }
}
