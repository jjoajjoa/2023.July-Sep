package study_0728;
public class Class01 {
	public static void main(String[] args) {
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 0; // 초기식
//		while(i<10) {
//			System.out.println(i++);
//			//i++;//증감식
//		}

		//(0 2 4 6 8 10 ... 100)
//		for(int i=0; i<=100; i+=2) {
//			System.out.println(i);
//		}
//		
//		int i = 0;
//		while(i<=100) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		//구구단
		//----------2단----------
		//2 X 1 = 2
		//2 X 2 = 4
		
		for(int j = 2; j<10; j++) {
			System.out.println("---------" + j +"단---------");
			for(int i = 1; i<10; i++) {
				System.out.println(j + " X " + i + " = " + i*j);
			}
		}
		
		int i=2;
		while(i<10) {
			int j=1;
			System.out.println("---------" + i +"단---------");
			while(j<10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		
		i=2;
		int j=1;
		while(i<10) {
			if(j==1) {
				System.out.println("---------" + i +"단---------");
			}
			System.out.println(i + " X " + j + " = " + i*j);
			j++;
			if(j>=10) {
				j = 1;
				i++;
			}
		}
	}
}

