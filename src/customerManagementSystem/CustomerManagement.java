package customerManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerManagement {
    private static final String FILE_NAME = "customers.txt";

    public static void addCustomer(Customer customer) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            writer.write(customer.getName() + ","
                    + customer.getAge() + ","
                    + customer.getFin() + "\n");

            System.out.println("CustomerManagementSystem.Annotations.customerSorting.Customer fayla elave edildi.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showCustomers() {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
