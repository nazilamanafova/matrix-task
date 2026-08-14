package annotations;

public class Main {
    public static void main(String[] args){
        Customer customer =
                new Customer("Nazile", 20, "naz@gmail.com", "5MNH2K");

        Validator.validate(customer);

        System.out.println("Validation passed!");

    }
}
