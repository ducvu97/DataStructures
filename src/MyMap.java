public class MyMap<K, V> {

    private int CAPACITY = 16;
    private NodeMap<K, V>[] table;

    private int size = 0;

    public MyMap() {
        table = new NodeMap[CAPACITY];
    }

    public MyMap(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        table = new NodeMap[CAPACITY];
    }

    public void put(K key, V value) {
        NodeMap<K, V> node = new NodeMap<>(key, value);
        int index = index(key);
        NodeMap<K, V> newNode = new NodeMap<>(key, value, null);
        if (table[index] == null) {
            table[index] = newNode;
            size++;
        } else {
            NodeMap<K, V> previousNode = null;
            NodeMap<K, V> currentNode = table[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null) {
                previousNode.setNext(newNode);
                size++;
            }
        }
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        NodeMap<K, V> nodeMap = table[index];
        while (nodeMap != null) {
            if (nodeMap.getKey().equals(key)) {
                value = nodeMap.getValue();
            }
            nodeMap = nodeMap.getNext();
        }
        return value;
    }

    public void remove(K key) {
        int index = index(key);
        NodeMap<K, V> previous = null;
        NodeMap<K, V> nodeMap = table[index];
        while (nodeMap != null) {
            if (nodeMap.getKey().equals(key)) {
                if (previous == null) {
                    nodeMap = nodeMap.getNext();
                    table[index] = nodeMap;
                    return;
                } else {
                    previous.setNext(nodeMap.getNext());
                    return;
                }
            }
            previous = nodeMap;
            nodeMap = nodeMap.getNext();
            size--;
        }
    }

    public void display() {
        for (int i = 0; i < CAPACITY; i++) {
            if (table[i] != null) {
                NodeMap<K, V> currentNode = table[i];
                while (currentNode != null) {
                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % CAPACITY);
    }


}
