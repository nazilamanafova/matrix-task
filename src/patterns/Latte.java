package patterns;

public class Latte implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Patterns.Latte preparing....");
    }
}
