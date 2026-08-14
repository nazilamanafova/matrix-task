package customerManagementSystem;

public class Customer {
    private String name;
    private int age ;
    private String fin;

    public Customer(String name, int age, String fin) {
        this.name = name;
        this.age = age;
        this.fin = fin;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getFin() {
        return fin;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("FIN: " + fin);
    }
}
