package Study01;
public class Class05 {
	public static void main(String[] args) {
		Goods5<Apple5> goods1 = new Goods5<>();
		goods1.set(new Apple5());
		Apple5 apple = goods1.get();
		
		Goods5<Pencil5> goods2 = new Goods5<>();
		goods2.set(new Pencil5());
		Pencil5 pencil = goods2.get();
		
		Goods5<Apple5> goods3 = new Goods5<>();
		goods3.set(new Apple5());
		//Pencil5 pencil2 = goods3.get(); //타입 체크
	}
}

class Apple5 {}
class Pencil5 {}

class Goods5<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}