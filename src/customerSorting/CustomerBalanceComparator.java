package customerSorting;

import java.util.Comparator;

public class CustomerBalanceComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return Double.compare(customer1.balance, customer2.balance);
    }
}
