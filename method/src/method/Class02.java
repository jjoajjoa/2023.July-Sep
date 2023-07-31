package method;

public class Class02 {

		
	public static int a = 1;
	public static int b = 1;
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a++);
		System.out.println(b++);
		func1();
		System.out.println("a : " + a + ", b : " + b);
		func2(a, b);
		System.out.println("a : " + a + ", b : " + b);
		func3();
		System.out.println("a : " + a + ", b : " + b);
		func4();
		func5();
		System.out.println("a : " + a + ", b : " + b);
////////////////////////////////////////////////////////////
		func6(a);
		func7(b);
		System.out.println("a : " + a + ", b : " + b);
		func8(a);
		func9(b);
		func10();
		func11();
	}

	
	public static void func1() {
		a++;
		b++;
	}

	
	public static void func2(int a, int b) {
		a++;
		b++;
	}

	
	public static void func3() {
		int a = -1;
		int b = -2;
	}
	
	
	public static int func4() {
		return a;
	}
	
	
	public static int func5() {
		return b;
	}
	
////////////////////////////////////////////////////////////
	public static int func6(int a) {
		return a+ 10;
	}
	
	
	public static int func7(int b) {
		return b+ 10;
	}
	
	
	public static void func8(int a) {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	
	public static void func9(int b) {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	public static void func10() {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	
	public static void func11() {
		int a = -1;
		int b = -2;
		System.out.println("a : " + a + ", b : " + b);
	}
}
