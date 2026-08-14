package customerSorting;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {


    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.name.compareTo(customer2.name);
    }
}
