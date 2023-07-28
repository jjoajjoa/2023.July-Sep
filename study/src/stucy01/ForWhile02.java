package stucy01;

import java.util.Scanner;

public class ForWhile02 {

	public static void main(String[] args) {

		
		
//break, continue
		
		// switch: break를 쓰면 switch문을 빠져나옴
		//  ㄴ for문,whlie문,switch문 빠져나올수있게 도와줌
/*		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println(i);
				if(j==5) {
					break;
				}
			}
		}
		
		
		// continue: for문,whlie문 건너뛸수있게
		// 	ㄴ 내 아래 코드 더이상 실행하지말고 계쏙해줘
		
		
		for (int i=0; i<=100; i++) {
			if(i%2==1) {
				continue;
				}
			System.out.println(i);
		}
*/		
		
		
///////////////////////////////////////////////////////////////////////////////////////		
/*		
		// 발사 카운트다운 시스템
		for (int i=10; i>=0; i--) {
			System.out.println(i);
			if(i==0) {
				System.out.println("발사~!");
				break;
			}
		}	
				
		
		// 구구단 -> Scanner, 1입력 홀수단출력, 2입력 짝수단출력		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1: 홀수단, 2: 짝수단");
		int input = scan.nextInt();
		
		if (input==1) { //홀수단					
			for (int j=2;j<10; j++) {
				if (j%2==1) {
					System.out.println("---------" + j + "단----------");
						
					for (int i=1; i<10; i++) {	
						System.out.println( j + " X " + i + " = " + i*j);								
					}
				}
			}		
		} 
		else if (input==2) { //홀수단					
			for (int j=2;j<10; j++) {
				if (j%2==0) {
					System.out.println("---------" + j + "단----------");
						
					for (int i=1; i<10; i++) {	
						System.out.println( j + " X " + i + " = " + i*j);								
					}
				}
			}		
		}
*/		
		
		// 숫자 5개 최고점, 점수학점 (저번에 한거 응용)
		// -> 숫자 n개 입력받아서 학점, 각각 몇명인지, M m A 구하기
		
		Scanner scan2 = new Scanner(System.in);
		

		int ni;
		int max = 0;
			
		for (int i=1; i<=10; i++) {
			
			System.out.print("점수 입력 : ");
			ni = scan2.nextInt();
			if(i==10) {				
				System.out.println("!!!!!!!!!!!!!!!!!");
				break;
			}
			
			if (ni > 90) {
				System.out.println("A학점");
			} else if (ni >= 80) {
				System.out.println("B학점");
			} else if (ni >= 70) {
				System.out.println("C학점");
			} else if (ni >= 60) {
				System.out.println("D학점");
			} else if (ni >= 50) {
				System.out.println("F학점");
			} else {
				System.out.println("과락");
			}	
		}
		
		

		
		
		
		
		
		
		
	}
}


