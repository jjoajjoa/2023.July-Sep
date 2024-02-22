package Study01;
public class Class02 {
	public static void main(String[] args) {
		Good1 good1 = new Good1();
		Apple apple = good1.getApple();
		
		Good2 good2 = new Good2();
		good2.setPencil(new Pencil());
		Pencil pencil = good2.getPencil();
		
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());
		Apple apple2 = (Apple) goods1.getObject();
		
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil());
		Pencil pencil2 = (Pencil) goods2.getObject();
		
//		Goods goods3 = new Goods();
//		goods3.setObject(new Apple());
//		Pencil pencil3 = (Pencil) goods3.getObject(); //잘못된 캐스팅
	}
}

class Apple extends Object{}
class Good1{
	private Apple apple = new Apple();
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

class Pencil extends Object{}
class Good2 {
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}

//어떻게 하면 Good1이랑 Good2를 합칠 수 있을까?
class Goods {
	private Object object = new Object();
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}