package homework;

public class Hw03 {

	public static void main(String[] args) {

		
		int[][] array = new int [5][5];
		
		System.out.println("-------------순방향----------------");
		// 순방향
		for(int i=0, k=0; i<5; i++, k+=5) {
			for(int j=0; j<5; j++) {
				array[i][j] = k+j+1;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		
		System.out.println("-------------세로방향----------------");
		// 세로방향
		for(int i=0; i<5; i++) {
			for (int j=0,k=1; j<5; j++,k++) {
				array[i][j] = (i) + (j+j+j+j+k);
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------순역방향----------------");
		// 역순방향
		for(int i=0, k=0; i<5; i++, k+=5) {
			for(int j=0; j<5; j++) {
				array[i][j] = k+j+1;
				System.out.println(array[i][j]);
				
				if ( i%5==0 ) {
					System.out.println(array[i][j] + " ");
				} else if (i%5==1) {
					System.out.println(array[j][i] + " ");
				}


			}
		}


		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}
}