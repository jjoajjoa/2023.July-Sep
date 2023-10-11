package homework;

public class Hw02 {

	public static void main(String[] args) {
		
		
		// * 트리 만들기 (뒤에서부터)
		
		String [] arr = new String[5];
			
//		arr[0] = 4spa 1sta
//		arr[1] = 3spa 2sta
//		arr[2] = 2spa 3sta
//		arr[3] = 1spa 4sta
//		arr[4] = 	  5sta
//				   j    i    
				
	
		int maxIndex = 20;
		
		String[] starArr = new String[maxIndex];
		String[] spaceArr = new String[maxIndex];
		
		String star = "*";
		String space = " ";
		
//		for(int i = 0; i < maxIndex; i++) {
//			starArr[i] = star;
//			star += "*";
//		}
//		
//		for(int i = maxIndex-1; i >= 0; i--) {
//			spaceArr[i] = space;
//			space += " ";
//		}
//		
//		for(int i = 0; i < maxIndex; i++) {
//			System.out.println(spaceArr[i]+starArr[i]);
//		}

		
		
		for (int i=1,j=maxIndex-1; i<=maxIndex&&j>=0; i++,j--) {
			
			
			String spaceResult = "";
			String starResult = "";
			
			if(j > 0) {				
				for(int x=0; x < j; x++) {
					spaceResult += space; 
				}
			}

			for(int x=0; x < i; x++) {
				starResult += star;
			}
			
			System.out.println(spaceResult + starResult);
			
		}
		
		

		
		arr[0] = "*";	
		System.out.println(arr[0]);
		
		for (int i=1; i<5; i++) {
			arr[i] = arr[i-1] + "*";
			System.out.println(arr[i]);
		}
		
		
		for (int i=4; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		

	}
}