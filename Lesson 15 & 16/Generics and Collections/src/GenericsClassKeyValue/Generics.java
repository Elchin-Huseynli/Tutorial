package GenericsClassKeyValue;

public class Generics <K,V> {
    private K key;
    private V value;

    public Generics(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void get() {
        System.out.println("Key: " + key + " - Value: " + value);
    }

}
