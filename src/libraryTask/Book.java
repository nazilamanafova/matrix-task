package libraryTask;

public class Book {
    String title;
    String author;
    double price;

    String  category;

    public Book(String title, String author, double price, String category){
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }
    public double calculatePrice(){
        return price;
    }
}

// maini
// task.Category programming = new task.Category("Programing");
//
//        LibraryTask.Book book1 = new LibraryTask.Book("Java Basics", "Author A", 30.0, "programming");
//        LibraryTask.Book book2 = new LibraryTask.Book("Advanced Java", "Author B", 50.0, "programming");
//        LibraryTask.DiscountedBook discountedBook = new LibraryTask.DiscountedBook("Spring LibraryTask.Book",
//                "Author C", 50.0, programming, 10);
//
//
//        LibraryTask.Shelf shelf1 = new LibraryTask.Shelf("A1");
//        shelf1.addBook(book1);
//        shelf1.addBook(book2);
//        shelf1.addBook(discountedBook);
//
//        LibraryTask.Library library = new LibraryTask.Library("Central LibraryTask.Library");
//        library.addShelf(shelf1);
//
//        LibraryTask.Member member = new LibraryTask.Member("Ali");
//
//        member.borrowedBook(book1);
//        member.borrowedBook(discountedBook);
//        LibraryTask.Printer printer = new LibraryTask.Printer();
//
//        printer.print(book1);
//
//        System.out.println("Discounted LibraryTask.Book: " + discountedBook.title
//                + " Price: " + discountedBook.calculatePrice());
//        System.out.println("LibraryTask.Library: " + library.name);
//
//        System.out.println("Shelves: " + library.count);
//        System.out.println("LibraryTask.Member: " + member.name);
//
//        System.out.println("Borrowed books: " + member.count);