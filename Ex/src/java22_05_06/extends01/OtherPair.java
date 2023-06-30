package java22_05_06.extends01;

public class OtherPair<K, V> {
	private K key;
	private V value;

	public OtherPair(K key, V value) {
		this.key = key; 
		this.value = value;
	}

	public K getKey()   { return key; }
	public V getValue() { return value; }
}
