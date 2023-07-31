package homework;

public class Hw01_teacher {

	public static void main(String[] args) {
		
		
		// 별 만들기
		
		 for(int i=0; i<5; i++) {
			 for (int j=0; j<i+1; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		
		 for(int i=0; i<5; i++) {
			 for (int j=0; j<5-i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		
		 for(int i=0; i<5; i++) {
			 for (int j=0; j<5; j++) {
				 if (i + j < 4) {
					 System.out.print(" ");
				 }
				 else {
				 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		
		
		 for(int i=0; i<5; i++) {
			 for (int j=0; j<5; j++) {
				 if (i > j) {
					 System.out.print(" ");
				 }
				 else {
				 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		
		
		
		
		

	}

}
