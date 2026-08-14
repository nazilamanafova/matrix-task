package patterns;

public class Cappuccino implements Coffee {
    @Override
    public void prepare() {
        System.out.println(" Factory.Cappuccino preparing...");
    }
}
