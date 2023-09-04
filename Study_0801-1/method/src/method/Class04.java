package method;
public class Class04 {

	public static void main(String[] args) {
		
		// 카드게임 
		// 컴퓨터(랜덤)랑 해보기
		// 랜덤난수 1~4 출력 -> 카드겜을 컴 VS 사람으로 수정해보기(함수화도 해보셍)
				
		for(int i=0; i<20; i++ ) {			
//			System.out.println(Math.random()); // 0과 1 사이 실수
//			System.out.println(Math.random()*10); // 0과 10 사이 실수
//			System.out.println((int)Math.random()*10); // 0 만 나옴
//			System.out.println((int)(Math.random()*10)); // 0과 9 사이 정수
//			System.out.println((int)(Math.random()*10+1)); // 0과 10 사이 정수
		}
		
		// 로또번호(근데 중복O)
		for(int i=0; i<7; i++) { 
			System.out.println((int)(Math.random()*45+1)); 
		}
		
		// 로또번호(근데 중복X)
		int[] arr = new int[7];
		for(int i=0; i<7; i++ ) {
			arr[i] = 0;
		}
		for(int i=0, j=0; i<7; i++) { 
			int num = (int)(Math.random()*45)+1;
			int check = 0;
					
			for(int k=0; k<j; k++) {
				if(arr[k] == num ) {
					i--;
					check = 1;
					break;
				}
			}
			
			if(check == 1) {			
				continue;
			}
			arr[j] = num;
			j++;
			System.out.println(num); 
		}		
	}
}
