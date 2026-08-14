package task;

public class Category {
    String name;

    public Category(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "task.Category: " + name;
    }
}
