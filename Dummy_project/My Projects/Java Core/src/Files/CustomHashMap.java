package Files;

public class CustomHashMap<K,V> {

    private static int DEFAULT_SIZE = 16;
    private int capacity;
    private Entry<K,V>[] table;

    static class Entry<K,V>{
        K key;
        V value;

        Entry<K,V> next;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }


    public CustomHashMap(){
        this(DEFAULT_SIZE);
    }

    public CustomHashMap(int size){
        this.capacity = size;
        this.table = new Entry[capacity];
    }
    private int calculateHash(K key){
        if(key == null) return 0;
        return Math.abs(key.hashCode()%capacity);
    }

    public void put(K key, V value){
        if(key == null) return;
        key = (K) key.toString().toLowerCase();
        int hash = calculateHash(key);

        Entry<K,V> newEntry = new Entry<>(key, value);


        if(table[hash] == null){
            table[hash] = newEntry;
        }else{
            Entry<K,V> current = table[hash];
            Entry<K,V> previous = null;
            while(current != null){
                    if(current.key.equals(key)){
                        current.value = value;
                        break;
                    }
                    previous = current;
                    current = current.next;
            }
            if(previous != null)
                previous.next = newEntry;
        }
    }

    public V get(K key){
        V value = null;
        if(key == null) return value;
        int hash = calculateHash(key);
        Entry<K,V> newEntry = table[hash];
        while(newEntry != null){
            if(newEntry.key.equals(key)){
                value = newEntry.value;
                break;
            }
            newEntry = newEntry.next;
        }
        return value;
    }
}
