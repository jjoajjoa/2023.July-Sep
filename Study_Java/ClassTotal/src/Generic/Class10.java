package Study01;

public class Class10 {
	public static void main(String[] args) {
		A10 a = new A10();
		a.method1("Hello");
		
		B10 b = new B10();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("gg");
			}
		});
	}
}

class A10 {
	public <T extends String> void method1(T t) {
		System.out.println(t.charAt(0));
	}
}

interface MyInterface {
	public abstract void print();
}

class B10 {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}