package Study01;
public class Class03 {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		mc1.setT("hello");
		System.out.println(mc1.getT());
		
		MyClass<Integer> mc2 = new MyClass<Integer>();
		mc2.setT(1234);
		System.out.println(mc2.getT());
		
//		MyClass<Integer> mc3 = new MyClass<Integer>();
//		mc3.setT("1234"); //Integer.parseInt
//		System.out.println(mc3.getT());
	}
}

class MyClass<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

//타입 변수(type variable)
//<T> : <Type>
//<E> : <Element>
//<K> : <Key>
//<V> : <Value>
//<N> : <Number>

//(대중성) <Val>