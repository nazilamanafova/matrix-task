package libraryTask;

public class Printer {
    public void print(String text){
        System.out.println(text);
    }
    public void print(String text, int count){
        for (int i = 0; i < count; i++){
            System.out.println(text);
        }
    }
    public void print(Book book){
        System.out.println("LibraryTask.Book: " + book.title
        +" price: " + book.price);
    }
}
