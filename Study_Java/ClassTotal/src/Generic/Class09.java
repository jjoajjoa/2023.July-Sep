package Study01;

public class Class09 {
	public static void main(String[] args) {
		//D<A2> d1 = new D<>();
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D<>(); // = D<B> d2 = new D<B>();
		
		d2.set(new B());
		d2.set(new C());
		
		//d3.set(new B());
		d3.set(new C());
		
		d4.set(new B());
		d4.set(new C());
	}
}

class A2 {}
class B extends A2 {}
class C extends B {}

class D<T extends B> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

//제네릭 바운드
// 제네릭 타입의 매개변수가 특정한 클래스 또는 인터페이스를 확장하거나 구현하도록 제한

//상한바운드 upper bound
//제네릭 타입의 매개변수가 특정 클래스의 하위 클래스 이어야 함

//하한바운드 lower 
//제네릭 타입의 매개변수가 특정 클래스의 상위 클래스 이어야 함

//만약 T가 넘버 클래스 또는 하위클래스 인티저 더블 등만 사용가능하다고 제한하면

//extends 키워드 사용해서 제한함
// 접근지정자 class 클래스명 <T extends Fruit> {}
//Fruit 또는 그 하위클래스만 사용 가능

//Goods<Apple> goods = new Goods<>(); O
//Goods<Pencil> goods = new Goods<>(); X
