package gameRandom;

public class Progress_ extends Dice{
	
	int mode;
	
	int modeChoice(int mode) {
		
		if(mode == 1) { //1판
			Progress_.mode1(nickName1, mode);	
		} else if(mode == 2) { //3판
			Progress_.mode2();
		} else if(mode == 3) { //먼저만원모으기
			Progress_.mode3();
		} else {
					
		}
		
		return mode;
	}
	
	
	
	
	
	
	static void mode1(String nickName1, int dice) { //1판
		for(int i=0; i<1; i++) {
			
		}		
	}
	
	static void mode2() { //3판
		for(int i=0; i<3; i++) {
			
		}
	}
	
	static void mode3() { //만원모으기
		for(int i=0; i<100; i++) {
			
		}
	}
	
	
	
//	System.out.println(nickName1+ "님의 주사위 값: " +dice.diceP1);

	
	
	
	
	
}
