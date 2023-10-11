package gameRandom;
// 랜덤값 뱉기
public class Dice {
	
//	String nickName1;
	int money;
	int diceP1 = (int)(Math.random()*6+1);
	int diceP2 = (int)(Math.random()*6+1);
	int diceCp = (int)(Math.random()*6+1);
	
	Dice() {
		
	}
			
	void printDiceP1() {
		System.out.println(diceP1);
	}
	
	void printDiceP2() {
		System.out.println(diceP2);
	}
	
	void printDiceCp() {
		System.out.println(diceCp);
	}
	
	

}
