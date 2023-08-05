package gameCard;

public class Progress {
	
	
	int play(int pl, int computer) {
		if((pl == 1 && computer == 4) || (pl == 4 && computer == 1)) {
			System.out.println("노예와 왕이 만났습니다!");
			if(pl == 1) {
				return 100;
			} else {
				return -100;
			}

		} else if(pl > computer) {
			return 1;
		} else if(computer > pl) {
			return -1;
		}
		return 0;
	}
	
	static void printRes(int score) {
		if(score > 10) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다.");
		} 
		else if(score < -10) {
			System.out.println("Player 2가 히든 룰로 승리하였습니다.");
		}
		else if(score > 0) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if(score < 0) {
			System.out.println("Player 2가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
	}
	
	
}
