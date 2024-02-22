package Study01;

public class Class14 {
	public static void main(String[] args) {
		Parent<String> p = new Parent<>();
		p.setT("pp");
		System.out.println(p.getT());
		
		Child1<String> c1 = new Child1<>();
		c1.setT("c1");
		System.out.println(c1.getT());
		
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("c2");
		c2.setV(22);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
	}
}

class Parent<T> {
	T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T> {
	
}

class Child2<T, V> extends Parent<T> {
	V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

// 제네릭 상속

//부모클래스가 제네릭인 경우 -> 자식클래스 또한 제네릭 (부모의 제네릭 변수를 물려받음)
//                          제네릭변수의 갯수는 부모와 같거나 많다

// class Parent<K, V>
// class Child<K, Y> extends Parent<K, V>