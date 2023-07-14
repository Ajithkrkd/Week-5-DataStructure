public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; // capacity
    private int size;

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int hashCode(Integer key) {
        return key % numOfBuckets;
    }

    public void put(Integer key, String value) {
        int pos = hashCode(key);
        HashNode node = new HashNode(key, value);

        if (buckets[pos] == null) {
            buckets[pos] = node;
            size++;
        } else {
            HashNode temp = buckets[pos];
            HashNode prev = null;

            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return; // Exit the method if key is found and updated
                }

                prev = temp;
                temp = temp.next;
            }

            prev.next = node; // Add the node at the end of the linked list
            size++;
        }
    }

    public String get(Integer key) {
        int pos = hashCode(key);
        HashNode temp = buckets[pos];

        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value; // Return the value if key is found
            }
            temp = temp.next;
        }

        return null; // Return null if key is not found
    }

    public void remove(Integer key) {
        int pos = hashCode(key);
        HashNode temp = buckets[pos];
        HashNode prev = null;

        while (temp != null) {
            if (temp.key.equals(key)) {
                if (prev == null) {
                    buckets[pos] = temp.next; // Remove the first node in the linked list
                } else {
                    prev.next = temp.next; // Remove the node by bypassing it in the linked list
                }
                size--;
                return; // Exit the method if key is found and removed
            }

            prev = temp;
            temp = temp.next;
        }
    }

    public void print() {
        for (var bucket : buckets) {
            if (bucket == null) {
                continue;
            } else {
                var temp = bucket;

                while (temp != null) {
                    System.out.println(temp.key + " : " + temp.value);
                    temp = temp.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        HashTable h = new HashTable(5);
        h.put(456, "Ajith");
        h.put(56, "j");
        h.put(56, "i");
        h.print();
        System.out.println(h.size);
        
        System.out.println("Value for key 456: " + h.get(456));
        h.remove(456);
        System.out.println("Value for key 456 after removal: " + h.get(456));
    }
}