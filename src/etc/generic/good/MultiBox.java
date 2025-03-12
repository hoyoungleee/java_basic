package etc.generic.good;

// 맵객체 타입 지정을 위한 멀티 제네릭
public class MultiBox<K, V> {

    private K key;
    private V value;



    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }
    public V get(K key){
        return this.value;
    }
}
