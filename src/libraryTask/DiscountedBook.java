package libraryTask;

public class DiscountedBook extends Book {
    double discount;

    public DiscountedBook(String title, String author,
                          double price, String category,
                          double discount){
        this.discount = discount;
        super(title, author, price, category);
    }

    @Override
    public double calculatePrice() {
        return price - discount;
    }
}
