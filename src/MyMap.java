public class MyMap<K, V> {

    private int CAPACITY = 8;
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
        NodeMap<K, V> nodeFirst = table[index];
        while (nodeFirst != null) {
            if (nodeFirst.getKey().equals(key)) {
                value = nodeFirst.getValue();
            }
            nodeFirst = nodeFirst.getNext();
        }
        System.out.println("Value :" +value);
        return value;
    }

    public void remove(K key) {
        int index = index(key);
        NodeMap<K, V> previous = null;
        NodeMap<K, V> nodeFirst = table[index];
        while (nodeFirst != null) {
            if (nodeFirst.getKey().equals(key)) {
                if (previous == null) {
                    nodeFirst = nodeFirst.getNext();
                    table[index] = nodeFirst;
                    return;
                } else {
                    previous.setNext(nodeFirst.getNext());
                    return;
                }
            }
            previous = nodeFirst;
            nodeFirst = nodeFirst.getNext();
            size--;
        }
    }

    public void display() throws NullPointerException {
        for (NodeMap<K, V> element : table) {
            if (element == null) {
                System.out.println("null");
                continue;
            }
            System.out.print("key: "+element.getKey()+"Value: "+element.getValue());
            while (element.getNext() != null) {
                element = element.getNext();
                System.out.print("," + "key: "+element.getKey()+"Value: "+element.getValue());
                if (element == null) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }

    private int index(K key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() & (CAPACITY-1);
    }


}
