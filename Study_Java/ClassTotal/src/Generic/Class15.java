package Study01;

public class Class15 {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.<Integer>print(10);
		
		child3 c = new child3();
		c.<Integer>print(123);
		c.print(123);
	}
}

class Parent2 {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class child3 extends Parent2 {}


