package patterns;

public class Main {
    public static void main(String[] args) {


//        double result = Patterns.Currency.USD.convert(100, Patterns.Currency.EUR);
//
//        System.out.println(result);


        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);


        // Builder pattern
        House house = new House.Builder()
                .setRooms(5)
                .setFloors(2)
                        .build();

        System.out.println(house);

        //Factroy pattern
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        coffee.prepare();







    }
}
