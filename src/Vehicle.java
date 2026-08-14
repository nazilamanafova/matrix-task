public class Vehicle {
    String brand;
    final int maxSpeed = 200;

    public Vehicle(String brand){
        this.brand = brand;
    }

    void start(){
        System.out.println(brand + " started");
    }
    void stop(){
        System.out.println(brand + " stopped");
    }
    final void engineInfo() {
        System.out.println("Engine info from Vehicle");
    }
}
