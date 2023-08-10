package Study;

public class Class02 {

	public static void main(String[] args) {
		
		int[][] arr = new int [8][8];
		
		int i = 0;
		int j = 0;
		int round = 1;
		
		while(true) {
			if(round%2==0) {
				arr[i][j] = 8*i+j+1;
			}
			
		}
		
		
		
		
		//출력
		for(int i=0; i<arr.length; i++) { //arr.length -> row의 길이
			for(int j=0; j<arr[0].length; j++) { //arr[0].length -> col의 길이
				if(arr[i][j] < 10 ) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();	
		}
		
		
		
		
		
		
		
		
	}
	
}







//		for(int i=0; i<arr.length; i++) { //arr.length -> row의 길이
//			for(int j=0; j<arr[0].length; j++) { //arr[0].length -> col의 길이
//				arr[i][j] = 8*i +j+1;
//				
//				
//			}
//			
//		}