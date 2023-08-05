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
		
		//카드선택
		int a = player.cardScan();
		player.playerCard(a);		
		computer.computerCard();		
		
		//게임진행
		
		
		
	} //메인끝

}
