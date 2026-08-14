package hashMap;

public class Main {
    public static void main(String[] args) {
        MyMap< Integer, String> myMap = new MyHashMap<>();

        myMap.put(1, "Nazile");
        myMap.put(2, "Leyla");
        myMap.put(3, "Aysel");

        System.out.println(myMap.get(2));
        myMap.put(2, "Ali");

        System.out.println(myMap.get(2));

        System.out.println(myMap.remove(1));

        System.out.println(myMap.size());

        for (Entry<Integer, String> entry: myMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue() );

        }
    }

}
