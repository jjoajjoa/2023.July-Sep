package Study01;
public class Class07 {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("hello");
		
		String[] str = {"apple", "banana", "kiwi", "mango", "orange"};
		printArray(str);
		
		Integer[] arr = {1,2,3,4,5};
		printArray(arr);
	}
	
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

class A {
	public <T> void method(T t) {
		System.out.println(t.equals("hello"));
		//System.out.println(t.length());
	}
}

//Object 메서드만 호출이 가능하다.

//매개변수(배열, 숫자, 숫자) -> 숫자에 해당하는 인덱스 위치에 있는 두 값의 자리를 서로 변경해주자.
