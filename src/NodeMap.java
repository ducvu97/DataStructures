public class NodeMap<K,V> {
    private K key;
    private V value;
    private NodeMap<K,V> next;
    private int hashCode;

    public NodeMap(K key, V value, NodeMap<K, V> next, int hashCode) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.hashCode = hashCode;
    }

    public NodeMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public NodeMap<K, V> getNext() {
        return next;
    }

    public void setNext(NodeMap<K, V> next) {
        this.next = next;
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }
}
