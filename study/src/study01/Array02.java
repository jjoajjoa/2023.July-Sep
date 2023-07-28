package study01;

public class Array02 {

	public static void main(String[] args) {
		
		
		
	//1차원 배열
	
		
		
	//2차원 배열: 면
	//자료형[][] 배열명 = new 자료형[크기][크기]
	//							가로  세로
		
		
////////예제01
		int [][] student = new int[6][4]; // 6학년까지 4반씩
		
//		System.out.println(student[0][3]); // 1학년 4반 학생 수 <- 초기화 해줘야함
		
		for(int i=0; i<6; i++) {
//			student[i][i] = 20; // 0 0 1 1 2 2 <- 학년이랑 반이 같은 애들만 초기화됨
			for(int j=0; j<4; j++) { // for문 한개 더 넣어서  총갯수(6*4) 만듦
				student[i][j] = 20; // 한반에 20명 있다는 뜻
			}
		}
		for (int i=0; i<6; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(student[i][j] + " "); // 잘 들어갔나 확인
			}
			System.out.println(); // 행렬모양으로 만들어줌
		}

		
		System.out.println("----------------------------");
		
////////예제02
		// 10*10 배열, 1~100 다 넣어주고 사각형으로 출력		
		int [][] num = new int[10][10]; // 10by10 행렬 생성
		
		
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) { // for문 한개 더 넣어서  총갯수(10*10) 만듦
					num[i][j] = 10*i+j+1; // 한반에 20명 있다는 뜻
				}
			}
			for (int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					System.out.print(num[i][j] + " "); // 잘 들어갔나 확인
				}
				System.out.println(); // 행렬모양으로 만들어줌
			}
		
		
	
		


		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
