package patterns;

public class CoffeeFactory {

    public static Coffee createCoffee(String type) {

        if (type.equals("Factory.Cappuccino")) {
            return new Cappuccino();
        }

        if (type.equals("latte")) {
            return new Latte();
        }

        throw new IllegalArgumentException("Factory.Coffee type tapılmadı");
    }
}
