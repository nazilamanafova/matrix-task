public class Motorcycle extends Vehicle{
    boolean hasHelmet;

    public Motorcycle(String brand, boolean hasHelmet){
        this.hasHelmet = hasHelmet;
        super(brand);
    }
    void wheelie(){
        System.out.println("Motorcycle wheelie");
    }
}
