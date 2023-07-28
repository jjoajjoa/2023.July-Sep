package study;

public class Prac_4 {

	public static void main(String[] args) {
		
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		
//01 논리연산자
		if (a<c && b<c) {
			System.out.println("c가 젤 큼");
		}

		
//02 중첩
		if (a<c) {
			if (b<c) {
				System.out.println("c가 젤 큼");
			}
		}
		
		
//03 if문
		if (a>=c) {
			System.out.println("a>=c");
		} else if (b>=c) {
			System.out.println("b>=c");
		} else {
			System.out.println("c가 젤 큼");
		}
		

//04
		if (!(a>c || b>c)) {
			
		}
		
		

	}

}
