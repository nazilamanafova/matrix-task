package animal;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void makeSound(){
        System.out.println("Animal.Animal sound");
    }
}
//ANimal classi yarat
//makeSound metodu
// iki extends eden cat ve dog classi
//cat ve dogun iicnde makesound metodunu overload edirik,
// her biri ozune uygun biri bark biri meow
// mainde bir animal array yaradiriq ve hemin icine dog ve catin yaziriq
// bir static method hemin arrayi qebul edir ve hamisinin makesoundunu cagirir