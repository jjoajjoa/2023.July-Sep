package Home;
// 변수 심화실습
// 연산자 이론, 기초실습, 심화실습
public class Class01 {

	public static void main(String[] args) {
		
		double d1 = 10.0;
		double d2 = 20.25;
		System.out.println(d1<d2); //true
		
		boolean b2 = d1 > d2;
		System.out.println(b2); //false
		System.out.println(!b2); //true
		System.out.println(d1 == 10.0); //true :예외: 10.000000000000000000000
		System.out.println(d2 != 20.25); //false :예외: 20.250000000000000000000001
		System.out.println((int) d2*10000 == (int) 20.25*10000); //true <- 실수
		
		System.out.println(d1 < d2 && b2); //F :: T && F
		System.out.println(d1 == 10.0 || d2 != 20.25); //T :: T||F
		//		d1이 10.0이랑 같아? 또는 d2가 20.25가 아니야?
		
		System.out.println(d1 < d2 && b2 || d1 == 10.0);//T :: T&&F||T -> F||T
		//		순서대로!!		 
		
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		System.out.println(n1 >= --n2 || n3 != 3 && n3 < n2 && n3-- > n2++); //T
		// 				1 >= 1 (t) || 3 != 3 (F) && 3<2 (F) &&  (T)
		//				T || F && T && T
		
	
		
	}

}


//		int num1 = 10;
//		int num2 = 20;
//		System.out.println((num1++) + (num2++)); //30 -> 코드가 끝나고 증가됨
//		System.out.println(num1 + num2); //32 <- 11과 21이 되어서





//	String str; //char 변수들의 집합 -> 객체 : 애초에 박스들이 여러개 붙어있음
//	// 속에 메소드도 들어있다.
//	char ch;


//		
//		
//		
//		d1 += 11; 
//		System.out.println(d1); // 21.0
//		d2 /= 4; // d2 = d2 / 4;
//		System.out.println(d2); // 5.0625 :: d2가 실수형이라 값도 실수형으로 나옴
//		d1 %= d2; // d1 = d1%d2; 나머지 정수? -> 5.0625 *4 -> 20.25
//		System.out.println(d1); // 0.75 <- 21.0 - 20.25
//		
//		System.out.println(d2++); // 5.0625 <- 출력한 다음에 증가시킴
//		System.out.println(d2); // 6.0625
//		System.out.println(d2--); // 6.0625 <- 출력한 다음에 감소시킴
//		System.out.println(d2); // 5.0625 






//		int a = 10;
//		float b = (float) 10.0;  // 자바 내에서 기본적인 실수형태가 double이라서
//		float c = (float) 20.25; // 
//		
//		System.out.println(a+1); // 11
//		System.out.println(a+b); // 20.0
//		System.out.println(a/b); // 1.0
//		System.out.println(b/c); // 10.0/20.25
//		System.out.println(a/3); // 3 :: 둘다 자료형이 int여서 int로 출력
//		System.out.println(a%b); // 0.0
//		System.out.println(b%c); // 10.0
//		System.out.println(a%3); // 3