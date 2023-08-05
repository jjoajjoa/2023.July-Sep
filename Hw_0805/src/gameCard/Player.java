package gameCard;
import java.util.Scanner;
public class Player {
	
	String namePlayer;
	int cardPlayer;
	
	Player(String namePlayer) {
		this.namePlayer = namePlayer;
	}
	
	int cardScan() {
		Scanner scan = new Scanner(System.in);
		int cardPlayer = scan.nextInt();
		return cardPlayer;
	}
	
	int playerCard(int a) {	
		System.out.println(namePlayer + "의 카드: " + a);
		return a;
	}
	
	
	
	
	
}
