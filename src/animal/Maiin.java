package animal;

public class Maiin {
    static void makeSound(Animal[] animals){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
        };

        makeSound(animals);
    }
}
