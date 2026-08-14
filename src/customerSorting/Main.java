package customerSorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "Nazile", 20, 1000, "Baku"));
        customers.add(new Customer(2, "Leyla", 22, 2000, "Nakhchivan"));
        customers.add(new Customer(3, "Ayna", 30, 3000, "Ganja"));


        Collections.sort(customers);

        System.out.println("Sorted by id ascending:");
        System.out.println(customers);

        customers.sort(new CustomerNameComparator());
        System.out.println("Sorted by name ascending");
        System.out.println(customers);

        customers.sort(new CustomerAgeComparator());
        System.out.println("Sorted by age ascending");
        System.out.println(customers);


        //Lambda

        customers.sort((Customer customer1, Customer customer2) ->
                customer1.getName().compareTo(customer2.getName())
        );
        System.out.println(" Lambda - name ascending");
        System.out.println(customers);


        customers.sort((customer1, customer2) ->
                Integer.compare(customer2.getAge(), customer1.getAge())
        );
        System.out.println(" Lambda - age descending");
        System.out.println(customers);

        customers.sort((Customer customer1, Customer customer2) ->
                Double.compare(customer1.getBalance(), customer2.getBalance())
        );

        System.out.println(" Lambda - balance ascending");
        System.out.println(customers);

        // method reference

        customers.sort(Comparator.comparing(Customer::getName));
        customers.sort(Comparator.comparing(Customer::getAge));
        customers.sort(Comparator.comparing(Customer::getBalance));

        //thenComparing
        customers.sort(Comparator.comparing(Customer::getAge).thenComparing(Customer::getName)
        );
        System.out.println(" Age then name: ");
        System.out.println(customers);

        customers.sort(
                Comparator.comparing(Customer::getCity).thenComparing(Comparator.comparingDouble
                        (Customer::getBalance).reversed()).thenComparing(Customer::getName)
        );

        System.out.println(" City, balance descending, name:");
        System.out.println(customers);

        // reversed

        customers.sort(
                Comparator.comparingInt(Customer::getAge).reversed()
        );

        System.out.println(" Age descending:");
        System.out.println(customers);

        //nullFirst and nullLast
        customers.sort(Comparator.nullsFirst(Comparator.comparing(Customer::getName)));

        customers.sort(Comparator.nullsLast(Comparator.comparing(Customer::getName)));

        //Filter customers from Baku
        List<Customer> bakuByBalance = customers.stream()
                .filter(customer -> customer.getCity().equals("Baku")).sorted
                        (Comparator.comparingDouble(Customer::getBalance).reversed()
                        ).toList();

        System.out.println(" Baku customers by balance descending:");
        System.out.println(bakuByBalance);

        // max min
        Optional<Customer> richestCustomer = customers.stream().max(Comparator.
                comparingDouble(Customer::getBalance)
        );
        System.out.println(" Richest customer: ");
        System.out.println(richestCustomer.orElse(null));

        Optional<Customer> youngestCustomer = customers.stream().min(Comparator.
                comparingInt(Customer::getAge)
        );

        System.out.println(" Youngest customer:");
        System.out.println(youngestCustomer.orElse(null));


        sortCustomers(customers, Comparator.comparing(Customer::getName));

        System.out.println(" Sorted using generic sortCustomers():");
        System.out.println(customers);

    }

    //generic sortCustomers method
    public static void sortCustomers(
            List<Customer> customers,
            Comparator<Customer> comparator
    ) {
        customers.sort(comparator);
    }


}

