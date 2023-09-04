package Home;
import java.util.Scanner;

public class Class04 {
// 배열
// 김포공항* - 공항시장 - 마곡나루* - 양천향교 - 가양* - 증미 - 당산* - 국회의사당 - 여의도*
// 9호선 급행*
// 어떤 열차 탈래? -> 급행여부
// 어디서 내릴래? -> 위에있는 역 중에 입력
// 급행은 일반역에 멈추지 않음
// 내가 탄 열차가 지나온 역들이 쭉 출력
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1김포공항* - 2공항시장 - 3마곡나루* - 4양천향교 - 5가양* - 6증미 - 7당산* - 8국회의사당 - 9여의도*");
		
		// 역 9개 배열 만들기
		String station[] = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
		//		인덱스번호			0			1		2		3		4		5		6		7			8
		
		//사용자 입력받기	
		System.out.print("승차역: ");
		int a = scan.nextInt();	
		int aidx = a-1; 
			if (aidx%2 == 0) {
				System.out.println("급행*열차 입니당");
			} else {
				System.out.println("일반열차 입니당");
			}		
		System.out.print("하차역: ");
		int b = scan.nextInt();	
		int bidx = b-1;
			if (bidx%2 == 0) {
				System.out.println("급행*열차 입니당");
			} else {
				System.out.println("일반열차 입니당");
			}
		
			
		System.out.println("-------------------");
		
		// 인덱스번호 짝수=급행	
		// 인덱스번호 홀짝=X		
		// 인덱스번호 홀수=일반
	
		
//		if(aidx%2 == 1) { //급행
//			System.out.println("==1");
//		} else if(aidx%2 == 0){ // 일반
//			System.out.println("==0");
//		}
		
		
		for(int i=0; i<9; i++) {
			if (i%2 == 0) { // 급행(idx짝)역 전부 출력
				System.out.println(station[i]); 
				
			} 
		} 
		
		
//		if(aidx == bidx) { //입력한 a~b까지 쭉 나오게
//			System.out.println("잘못입력");
//		} else if(aidx > bidx) {
//			System.out.println("잘못입력");
//		} else {		  
//			for(int i=0; i<(b-a+1); i++, aidx++) { //9번 실행
//				System.out.println(station[aidx]);
//			}
//		}			
		

 		
		
		
		
		
		
	
		
		
		

		
	} //메인끝

} //클래스끝
