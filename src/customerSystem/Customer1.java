package customerSystem;

public class Customer1 {
    String name;
    BankProduct[] products;

    public Customer1(String name, BankProduct[] products){
        this.name = name;
        this.products = products;
    }
    public double calculateProductIncome(){
        double total = 0;

        for (BankProduct product : products){
            total += product.calculateIncome();
        }
        return total;
    }
    public void showProducts(){
        System.out.println("CustomerManagementSystem.Annotations.customerSorting.Customer: " + name);

        for (BankProduct product : products) {
            System.out.println(product);
        }
        System.out.println("Total Income: " + calculateProductIncome());
    }

}

//CustomerSystem.Customer1 adli class (String name, CustomerSystem.BankProduct[] products)
//double calculateProductIncome();
// CustomerSystem.BankProduct (double price)
//  double calculateIncome() {return price}
// CustomerSystem.Card (String pan, int expireMonth, double balance) Bankdan extends edir
// calculateIncome() {return price + (balance * expireMonth * 0.01)}
// CustomerSystem.Loan (String loonId, double debt) Bankdan extends edir
//calculateIncome() {return price - debt}
// override toString methods
// bir customer ve onun her mehsul uzre income hesablama
