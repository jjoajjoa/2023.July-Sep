package method;

public class class01 {

/////// 지역변수 & 전역변수
	
	public static int a = 10;
	public static int b = 20; // 전역변수: 파란색
	
	
	public static void main(String[] args) {
						
		//지역변수
		//반복문 안에서 사용했었던: for(int i=0) {}
		//매개변수도 지역변수
		
		int a=1;  // 지역변수
		int b=2;  // 전역변수X <- main함수 안에서 활동하기 때문에		
		
		System.out.println(function());
		System.out.println(a+b);
		function(a,b);
	}

	
	public static int function() {
		return a + b;
	}
	
	public static void function(int a, int b) {
		System.out.println(a+b);
	}
}
