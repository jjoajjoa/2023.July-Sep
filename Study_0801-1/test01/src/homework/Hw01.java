package homework;

public class Hw01 {

	public static void main(String[] args) {


		// * 트리 만들기 (앞에서부터)
		
		// 01
//		String a = "*";
//		System.out.println(a);		
//		for (int i=0; i<4; i++) {			
//			a = a + "*";			
//			System.out.println(a);
//		}	
		
		// 02
//		String a = "*";
//		for (int i=0; i<5; i++) {			
//			System.out.println(a);
//			a = a + "*";			
//		}
		
		
		
		// * 트리 만들기 (앞에서부터 -> 역순): 배열사용	
		
		String [] array = new String[5];	
		
		array[0] = "*";	
		System.out.println(array[0]);
		
		for (int i=1; i<5; i++) {
			array[i] = array[i-1] + "*";
			System.out.println(array[i]);
		}
		
		
		for (int i=4; i>=0; i--) {
			System.out.println(array[i]);
		}	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
