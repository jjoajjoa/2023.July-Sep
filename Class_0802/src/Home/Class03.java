package Home;
import java.util.Scanner;

public class Class03 {
// 사용자가 숫자를 계속 입력 -> 입력값을 합해서 출력해주기
// 사용자가 음수를 입력하면 종료
// 사용자가 두자리수 입력하면 더이상 더해지지 않기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세용");
		
		int x = 0; // 입력값 누적합용
		
		while(true) { //입력한만큼
			
			int a = scan.nextInt(); //입력받은값		
			
			if(a<0) { //음수-> 종료
				System.out.println("종료, 누적합: " + x);
				break;
			} else if((10-a) < 0) { //두자리수(10 이상)-> 누적끝 
				continue;
			} else if(a>=0) { //a a+a a+a+a a+a+a+a			
				x += a; 
				System.out.println("누적합 : " + x);	
			}
								
		} //for문 끝
		
		

	} //메인끝

} //클래스끝

















//break 그만!
//switch, 반복문
//더 실행하지말고 멈춰

//continue 쭉쭉!
//반복문
//내 아래코드 무시하고 반복문 계속 진행시켜


//		for (int i=1; i<=100; i++) {
//			if(i%2==1) { 
//				continue;
//			}
//		System.out.print(i);
//		}