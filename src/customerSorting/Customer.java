package customerSorting;

public class Customer implements Comparable<Customer> {
    int id;
    String name;
    int age;
    double balance;
    String city;

    public Customer(int id, String name, int age, double balance, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "customerSorting.Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", city='" + city + '\'' +
                '}';
    }

}
