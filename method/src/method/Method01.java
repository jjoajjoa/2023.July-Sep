package method;

public class Method01 {

	public static void main(String[] args) {
				
		// 함수 <- f(x) : 입력값이 있고, 출력값이 있는 것.
		// 자료형 함수명(입력값=매개변수) {
		//	code
		// 	반환값(=출력값)
		// }
		// 매개변수 -> 자료형 변수명, 여러개 존재 가능. -> void 매개변수 없음
		// 반환값 -> 딱 한개 -> void 반환값 없음
		
		System.out.println(function1());
		System.out.println(sum(10, 30));

	}
	
	public static int function1() {
		return 1;
	}

	public static void function2(int x) {
		System.out.println(x);
		return;
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
	
}
