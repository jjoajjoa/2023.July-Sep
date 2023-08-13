package gameCard;
import java.util.ArrayList;
public class Computer {

	String nameCom;
	int numCom = (int)(Math.random()*4+1);
	
	
	ArrayList<Computer> randomList = new ArrayList<>();
	
	
	
	Computer() {
		nameCom = "Computer";
	}
	
	void computerCard() {
		System.out.println(nameCom + "의 카드: " + numCom);
	}
	
}

