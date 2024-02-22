package Study01;
public class Class04 {
	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<>(); //생성자의 경우 내부 타입 생략 가능
		kv1.setKey("사과");
		kv1.setValue(2000);
		System.out.println("KEY : " + kv1.getKey() + ", VALUE : " + kv1.getValue());
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		int num = kv2.getKey();
		String message = kv2.getValue();
		System.out.println("Error Code : " + num + ", Error Message : " + message);
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용하겠음.");
		System.out.println(kv3.getKey());
	}
}

//KeyValue : 특정 키 값과 그에 따른 Value 쌍으로 이루어진 데이터 구조
class KeyValue<K, V> {
	private K key;
	private V value;
	
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
}

//객체 생성시 제네릭 타입을 지정하지 않으면?
//MyClass<Object> mc1 = new MyClass();
//MyClass mc2 = new MyClass();

//올 수 있는 Type 중 최상위 클래스로 인식한다.

//Apple, Pencil - 제네릭으로 수정해보기
