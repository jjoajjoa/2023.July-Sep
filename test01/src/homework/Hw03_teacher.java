package homework;

import java.util.Scanner;

public class Hw03_teacher {

	public static void main(String[] args) {
		
		
		// 계급순으로 승패갈리는 게임
		// {"거지", "시민", "귀족", "왕"}
		// 거지와 왕이 이기면 거지를 낸 플레이어가 겜 승리
		
		Scanner sc = new Scanner(System.in);
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int score1 = 0;
		int score2 = 0;
//		int hr = 0; //히든룰
		
		for(int i=0; i<4; i++) {
			System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.println("플레이어 1 차례 : ");
			int player1 = sc.nextInt();
			System.out.println("플레이어 2 차례 : ");
			int player2 = sc.nextInt();
			
			if ((player1==1 && player2==4) || (player1==4 && player2==1)) {
				System.out.println("노예와 왕이 만났슴당");
				if (player1 == 1) {
					score1 += 4; 
				} else {
					score2 += 4; 
				}
//				score += 4; 
//				hr = 1;
				break;
			}
			if(player1 > player2) {
				score1 += 1;
			} else if (player2 > player1) {
				score2++;
			} 
		}
		
		if (score1 > score2) {
			System.out.println("플레이어 1 승리");
		} else if (score1 > score2) {
			System.out.println("플레이어 2 승리");
		} else {
			System.out.println("무승부!");
		}
		
		
		
		
		

	}

}
