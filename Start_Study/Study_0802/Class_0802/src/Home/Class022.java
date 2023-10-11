package Home;
import java.util.Scanner;
// 가위바위보
public class Class022 {
// 반복문 사용
// 두명이 5번 게임했을때 누가 이겼는지
// 혹은 첫번째 사람이 몇승 몇무 몇패
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("어떤걸 내시겠습니깡? 숫자를 선택해주세용");
		
		int win = 0;
		int tie = 0;
		int lose = 0;
		
		// 다섯번 반복 -> i=5	
		for (int i=0; i<5; i++) {
			
			System.out.println("Player1 : 1.가위, 2.바위, 3.보자기");
			int a = scan.nextInt(); 
			System.out.println("Player2 : 1.가위, 2.바위, 3.보자기");
			int b = scan.nextInt();
			
			while(true) {
				if(a==1 || a==2 || a==3) {
					break;
				}
				System.out.println("잘못입력!");
				a = scan.nextInt(); 
			}
			
			while(true) {
				if(b==1 || b==2 || b==3) {
					break;
				}
				System.out.println("잘못입력!");
				b = scan.nextInt(); 
			}
			
			if(a == b) {//a.equals(b)
				System.out.println("무승부");
				tie++;
			} else if(a==1 && b == 2) {
				System.out.println("패배");
				lose++;
			} else if(a == 1 && b == 3) {
				System.out.println("승리");
				win++;
			} else if(a == 2) {
				if(b==1) {
					System.out.println("승리");
					win++;
				} else if(b==3) {
					System.out.println("패배");
					lose++;
				}
			} else if(a == 3) {
				if(b==1) {
					System.out.println("패배");
					lose++;
				} else if(b==2) {
					System.out.println("승리");
					win++;
				} 
			}
				
		} //for끝
		
		System.out.println(win + "승 " + tie + "무 " + lose +"패");
		

	} //메인끝

} //클래스끝
