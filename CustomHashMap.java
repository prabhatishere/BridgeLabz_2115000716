import java.util.*;

public class CustomHashMap<K, V> {
    private static final int SIZE = 16; // Default bucket size
    private LinkedList<Entry<K, V>>[] buckets;

    // Entry class (Key-Value Pair)
    static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
    }

    // Hash Function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Insert or Update Key-Value Pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key exists
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value)); // Insert new entry
    }

    // Retrieve Value for a Key
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return null;

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    // Remove a Key-Value Pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return;

        Iterator<Entry<K, V>> iterator = buckets[index].iterator();
        while (iterator.hasNext()) {
            if (iterator.next().key.equals(key)) {
                iterator.remove();
                return;
            }
        }
    }

    // Display HashMap Contents
    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            if (buckets[i] != null) {
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        
        // Insert entries
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Banana", 25); // Updating Banana

        // Retrieve values
        System.out.println("Value for 'Banana': " + map.get("Banana")); // 25

        // Remove a key
        map.remove("Cherry");

        // Print final hashmap
        System.out.println("Final HashMap:");
        map.printMap();
    }
}
