package gameCard;

public class Progress {
	
	int pl;
	int numCom;
	
	Progress(int pl, int numCom) {
		this.pl = pl;
		this.numCom = numCom;
	}
	
	
	static int play(int pl, int numCom) {
		if((pl == 1 && numCom == 4) || (pl == 4 && numCom == 1)) {
			System.out.println("노예와 왕이 만났습니다!");
			if(pl == 1) {
				return 100;
			} else {
				return -100;
			}

		} else if(pl > numCom) {
			return 1;
		} else if(numCom > pl) {
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
