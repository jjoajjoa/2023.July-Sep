package Study01;
public class Class06 {
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		String str1 = gm.method1("Hello");
		String str2 = gm.<String>method1("World");
		System.out.println(str1);
		System.out.println(str2);
		
		boolean bool1 = gm.method2(2.5, 2.5);
		boolean bool2 = gm.<Double>method2(3.5, 4.5);
		System.out.println(bool1);
		System.out.println(bool2);
		
		gm.<String, Integer>method3("수학", 99);
		gm.method3("영어", 88);
	}
}

class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}

	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}

	public <K, V> void method3(K k, V v) {
		System.out.println(k + " : " + v);
	}
}

//제네릭 메서드(Generic Method) - 리턴 타입 또는 매개 변수의 타입을 제네릭 타입으로 선언
//제네릭 메서드를 사용하면 메서드를 호출할 때마다 다양한 타입의 인수를 사용하거나 반환하는 것이 가능해진다.

//접근지정자 <T> returnType methodName(T parameter)
//<T> T method1(T t)
//<T> boolean method2(T t1, T t2)