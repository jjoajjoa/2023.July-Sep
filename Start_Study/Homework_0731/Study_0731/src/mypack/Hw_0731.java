package mypack;

import java.util.Scanner;

public class Hw_0731 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//난수자판기(1~4)
//		int[] arr = new int[4];
//		
//		for(int i=0; i<4; i++) {
//			arr[i] = 0;
//		}		
//		for(int i=0, j = 0; i<4; i++) {
//			int num = (int)(Math.random()*4)+1;
//			int check = 0;
//			for(int k = 0; k < j; k++) {
//				if(arr[k] == num) {
//					i--;
//					check = 1;
//					break;
//				}
//			}
//			if(check == 1) {
//				continue; 
//			}		
//			arr[j] = num;
//			j++;
//			System.out.println(num); //0~1
//		}
		
		
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int scoreUser = 0;
		int scoreComputer = 0;
		int hr1 = 0; //히든룰
		
		for(int i=0; i<4; i++) {
			System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
			System.out.println("User 차례 : ");
			int playerUser = sc.nextInt();
			System.out.println("Computer 차례 : ");
			int playerComputer = (int)(Math.random()*4)+1;
			System.out.println(playerComputer);
			
			
			if((playerUser == 1 && playerComputer == 4) || (playerUser == 4 && playerComputer == 1)) {
				System.out.println("노예와 왕이 만났습니다!");
				if(playerUser == 1) {
					scoreUser += 4;
					hr1 = 1;
				} else {
					scoreComputer += 4;
				}
				break;
			}
			else if(playerUser > playerComputer) {
				scoreUser++;
			} else if(playerComputer > playerUser) {
				scoreComputer++;
			}
		}
		
		if(hr1 == 1) {
			System.out.println("User가 히든 룰로 승리하였습니다.");
		} else if(scoreUser > scoreComputer) {
			System.out.println("User가 승리하였습니다.");
		} else if(scoreUser < scoreComputer) {
			System.out.println("Computer가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}		
		

		

	}

}
