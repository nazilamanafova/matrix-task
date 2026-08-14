package listTask;

public class Main {
    public static void main(String[] args){

        System.out.println(" linkedList.MyArrayList ");

        MyList<String> arrayList = new MyArrayList<>();

        arrayList.add("Ali");
        arrayList.add("Fidan");
        arrayList.add("Murad");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        arrayList.remove(1);

        System.out.println("After remove:");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        System.out.println("Size: " + arrayList.size());


        System.out.println("\n MyLinkedList");

        MyList<Integer> linkedList = new MyLInkedLIst<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));

        linkedList.remove(2);

        System.out.println("After remove:");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println("Size: " + linkedList.size());
    }
}
