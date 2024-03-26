package Files;

import java.io.Serializable;
import java.util.Map;

public interface CustomHashMapInterface<K,V> extends Map<K, V>, Cloneable, Serializable {
    V put(K key , V value);
}
