package customerSorting;

import java.util.Comparator;

public class CustomerAgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return Integer.compare(customer1.age, customer2.age);
    }
}
