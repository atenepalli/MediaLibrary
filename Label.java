/**
 * represents a mapping between keys and values
 * @param <K> - keys
 * @param <V> - values
 */
public class Label<K,V extends Comparable<V>> implements Comparable<Label<K,V>> {
    private K key;
    private V value;

    /**
     * constructor
     * @param key - key
     * @param value - value
     */
    public Label(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * getter method
     * @return key
     */
    public K getKey() {
        return key;
    }

    /**
     * getter method
     * @return value
     */
    public V getValue() {
        return value;
    }

    /**
     * equals method that checks the values
     * @param o - Object type
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        return (o != null && o instanceof Label && this.getValue().equals(((Label<?, ?>) o).getValue()));
    }

    /**
     * compares subclasses of Media
     * @param o - Label<k,v>
     * @return int
     */
    @Override
    public int compareTo(Label<K, V> o) {
        //Books come before Movies, Movies come before Series, Series come before Music
        if (o != null) {
            return this.getValue().compareTo(o.getValue());
        }
        return -1;
    }
}
