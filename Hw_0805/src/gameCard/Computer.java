package gameCard;
public class Computer {

	String nameCom;
	int numCom = (int)(Math.random()*4+1);
	
	Computer() {
		nameCom = "Computer";
	}
		
	void computerCard() {
		System.out.println(nameCom + "의 카드: " + numCom);
	}
	
}
