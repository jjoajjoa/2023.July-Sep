package Study01;

public class Class11 {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.method1(new Goods11<A11>());
		//t.method1(new Goods11<B11>());
		//t.method1(new Goods11<C11>());
		//t.method1(new Goods11<D11>());
		
		t.method2(new Goods11<A11>());
		t.method2(new Goods11<B11>());
		t.method2(new Goods11<C11>());
		t.method2(new Goods11<D11>());
		
		//t.method3(new Goods11<A11>());
		t.method3(new Goods11<B11>());
		t.method3(new Goods11<C11>());
		t.method3(new Goods11<D11>());
		
		t.method4(new Goods11<A11>());
		t.method4(new Goods11<B11>());
		//t.method4(new Goods11<C11>());
		//t.method4(new Goods11<D11>());
		
	}
}

class A11{}
class B11 extends A11{}
class C11 extends B11{}
class D11 extends C11{}

class Goods11<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

class Test {
	void method1(Goods11<A11> g) {}
	void method2(Goods11<?> g) {} // = Goods11<? extends Object> g
	void method3(Goods11<? extends B11> g) {}
	void method4(Goods11<? super B11> g) {} // super 로어바운드 하한제한
// <? extends 클래스> : 매개변수의 자료형을 특정 클래스를 상속받은 클래스로 제한함
}
