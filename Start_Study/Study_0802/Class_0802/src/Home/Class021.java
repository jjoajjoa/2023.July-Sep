package Home;
import java.util.Scanner;

public class Class021 {
// 가위바위보 대결
	public static void main(String[] args) {
		
		// 사람 vs 사람
		Scanner scan = new Scanner(System.in);
		
		System.out.println("어떤걸 내시겠습니깡? 숫자를 선택해주세용");
		System.out.println("Player1 : 1.가위, 2.바위, 3.보자기");
		int a = scan.nextInt(); //P1=a
		System.out.println("Player2 : 1.가위, 2.바위, 3.보자기");
		int b = scan.nextInt(); //P2=b
		
		// 이기려면
		// 가위1<바위2, 바위2<보자기3, 보자기3<가위1
		
		if (a<b) {
			System.out.println("Player2 이 이겼어용~~");
		} else if(a==1 && b==2) {
			System.out.println("Player2 이 이겼어용~~");
		} else if(a==3 && b==1) {
			System.out.println("Player1 이 이겼어용~~");
		} else if (a>b) {
			System.out.println("Player1 가 이겼어용~~");
		} else {
			System.out.println("무승부!"); // a.equals(b) :: 스트링으로 받았을 때
		}
		
		
		if(a==b) {
			System.out.println("무승부!");
		} else {
			switch(a) {
			case 1:
				if(b==2) {
					System.out.println("패배");
				} else if(b==3){
					System.out.println("승리");
				}
				break;
			case 2:
				switch(b) {
				case 1:
					System.out.println("승리");
				case 3:
					System.out.println("패배");
				}
				break;
			case 3:
				if(b==1) {
					System.out.println("패배");
				} else if(b==2){
					System.out.println("승리");
				}
				break;
			}
		}
		
		

	} //메인함수 끝

} //클래스 끝
