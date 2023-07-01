package java22_05_09.test02;

public class Util {
	// <K, V>타입의 V를 매개변수를 가짐
	// -> getValue()가 호출 될 때 실제 타입에 의해  
	// return 타입이 결정
	// => main에서 Pair<String, Integer>를 사용하고 있기때문에
	// 해당 V의 return타입은 Integer가 되는거임
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey().equals(k)) {
			return p.getValue();
		}
		
		return null;
	}
	
}
 