package gameCard;
import java.util.Scanner;
public class MainClassCard {

	public static void main(String[] args) {
		
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int score = 0;
		
		Scanner scan = new Scanner(System.in);
		Player player = new Player("User");
		Computer computer = new Computer();		
		System.out.println(" ~ 거지의 반란 ~");
		System.out.println("카드를 선택하세용 // 1.거지, 2.시민, 3.귀족, 4.왕");	
		
//		//카드선택
//		int pl = player.cardScan();
//		player.playerCard(pl);		
//		computer.computerCard();		
		
		//게임진행
		for(int i=0; i<4; i++) {
			
			int pl = player.cardScan();
			player.playerCard(pl);		
			computer.computerCard();
			
			score += Progress.play(pl, computer);
			if(score > 10 || score < -10) {
				break;
			}
		}		
		Progress.printRes(score);
	
		
		
		
	} //메인끝

}
