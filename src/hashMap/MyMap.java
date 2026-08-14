package hashMap;

import java.util.Set;

public interface MyMap<K, V> {

    V put(K key, V value);
    V get(K key);
    V remove(K key);
    int size();
    Set<Entry<K, V>> entrySet();

}
