package study_0728;
//2.숫자를 n개 입력받아서, A, B, C, D, F가 각각 몇 명인지, 최고점, 최하점, 평균

import java.util.Scanner;

public class Class04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		int max = 0;
		int min = 100;
		
		for(int i=0; i<5; i++) {
			int score = sc.nextInt();
			if(max < score) {
				max = score;
			}
			if(min > score) {
				min = score;
			}
			
			if(score >= 90) {
				System.out.println("A학점");
				A++;
			}
			else if(score>=80) {
				System.out.println("B학점");
				B++;
			}
			else if(score >= 70) {
				System.out.println("C학점");
				C++;
			}
			else if(score >= 60 ) {
				System.out.println("D학점");
				D++;
			}
			else {
				System.out.println("F학점");
				F++;
			}
		}
		System.out.println("A : " + A + ", B : " + B + ", C : " + C + ", D : " + D + 
				", F : " + F);
		System.out.println("Max : " + max + ", Min : " + min);
	}
}
