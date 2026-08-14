package libraryTask;

public class Library {
    String name;
    Shelf[]shelves;
    int count = 0;

    public Library(String name){
        this.name = name;
        shelves = new Shelf[10];
    }
    public void addShelf(Shelf shelf){
        shelves[count] = shelf;
        count++;
    }
}
