package gameRandom;
import java.util.Scanner;

public class MainClassRand {

	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("  ~렛츠고! 랜덤-다이스-랜드~");
		System.out.println();
		Dice dice = new Dice();
		int[] arrDice = new int[6];
		
		System.out.println("[system] 닉네임을 입력해주세용");
		String nickName1 = scan.nextLine();
//		Dice dice = new Dice(nickName1);
		System.out.println("[system] " +nickName1+ "님, 도전자를 선택해주세용");
		System.out.println("1. " +nickName1+ " VS Player2 // 2. " +nickName1+ " VS Computer");
		int pvs = scan.nextInt();
		
		System.out.println("[system] 도전모드를 선택해주세용");
		System.out.println("1. 즉결심판모드 // 2. 한국인모드 // 3. 리치맨모드");
						//  onekill(1판)		three(3판)	  richman(만원)
		int mode = scan.nextInt();
		
		if(pvs == 1) { //Player1 vs Player2
			System.out.println("pvp모드를 선택하셨습니당");
		} else if(pvs == 2) { //Player1 vs Computer
			System.out.println("pvc모드를 선택하셨습니당");
		} else {
			System.out.println("다시 선택해주세용");
		}
		
		
		
		
		
		if(pvs == 1) { //Player1 vs Player2
			System.out.println("pvp모드를 선택하셨습니당");
			
			System.out.println(nickName1+ "님의 주사위 값: " +dice.diceP1);
			System.out.println(nickName1+ "님의 주사위 값: " +dice.diceP2);
			
			dice.printDiceP1();
			dice.printDiceP2();
			
			
			for(int i=0;i<3;i++) {
				
			}
			
			
			
			
			
			
			
		} else if(pvs == 2) { //Player1 vs Computer
			System.out.println("pvc모드를 선택하셨습니당");
			
			dice.printDiceP1();
			dice.printDiceCp();
			
			
			
			
			
			
		} else {
			System.out.println("다시 선택해주세용");
		}

	} // 메인끝
	
	
	
	static void mode1(String nickName1, int dice) { //1판
		
		System.out.println(nickName1+ "님의 주사위 값: " +dice.diceP1);
		System.out.println(nickName1+ "님의 주사위 값: " +dice.diceP2);
		
		
		
		
		
	}
	
	static void mode2() { //3판
		
	}
	
	static void mode3() { //만원모으기
		
	}
	

} //클래스끝
