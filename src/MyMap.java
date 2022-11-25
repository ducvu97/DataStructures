public class MyMap<K,V> {
    private int size = 1;
    private NodeMap<K, V> head;
    private NodeMap<K, V> rear;

    public V get(K key) {
        NodeMap<K, V> temp = head;
        while (true) {
            if (size == 0 || temp == null) {
                return null;
            }
            if (temp.getKey().equals(key)) {
                break;
            }
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public NodeMap<K, V> put(K key, V value) {
        NodeMap<K, V> temp = head;
        NodeMap<K, V> newNode = new NodeMap<>(key, value);
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                temp.setValue(value);
                return newNode;
            }
            temp = temp.getNext();
        }
        if (rear == null) {
            this.head = this.rear = newNode;
            return newNode;
        }
        this.rear.setNext(newNode);
        this.rear = newNode;
        size++;
        return newNode;

    }

    public int size() {
        return size;
    }

    public boolean remove(K key) {
        NodeMap<K, V> temp = head;
        NodeMap<K, V> previous = null;
        if (size == 0) {
            return false;
        }
        while (true) {
            if (temp == null) {
                return false;
            }
            if (temp.getKey().equals(key)) {
                if (previous != null) {
                    previous.setNext(temp.getNext());
                }
                temp.setNext(null);
                this.size--;
                return true;
            }
            previous = temp;
            temp = temp.getNext();
        }
    }

}
