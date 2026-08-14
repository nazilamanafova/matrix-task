package integerTask;

public class Main {
    public static void main(String[] args){
//        integerTask.MyStringBuilder myStringBuilder = new integerTask.MyStringBuilder();
//        myStringBuilder.append("Hello");
//        myStringBuilder.append(" ");
//        myStringBuilder.append("World");
//
//        System.out.println(myStringBuilder);

        MyStack<Integer> numbers = new MyStack<>();
        numbers.set(10);
        numbers.set(20);
        System.out.println(numbers.get());
        System.out.println(numbers.get());


        MyStack<String> words = new MyStack<>();

        words.set("Hello");
        words.set("World");
        System.out.println(words.get());
        System.out.println(words.get());

        Calculator<Integer> calculator = new Calculator();
        calculator.setValue(10);

        Calculator<Double> calculator1 = new Calculator();
        calculator1.setValue(5.5);






    }
}
