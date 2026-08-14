package hashMap;

import java.util.HashSet;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V > {

    private Entry<K, V>[] entries;
    private int size;

    public MyHashMap() {
        entries = new Entry[5];
    }

    @Override
    public V put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if (entries[i].getKey().equals(key)) {
                V oldValue = entries[i].getValue();

                entries[i].setValue(value);

                return oldValue;
            }
        }
        entries[size] = new Entry<>(key, value);
        size++;
        return null;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size;  i++){
            if (entries[i].getKey().equals(key)){
                return entries[i].getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        for (int i  = 0; i < size; i++){

            if (entries[i].getKey().equals(key)) {
                V removedValue = entries[i].getValue();

                for (int j = i; j < size - 1; j++) {
                    entries[j] = entries[j + 1];
                }
                entries[size - 1] = null;
                size--;
                return removedValue;

            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {

        Set<Entry<K, V>> set = new HashSet<>();

        for (int i = 0; i< size; i++){
            set.add(entries[i]);
        }

        return set;
    }
}
