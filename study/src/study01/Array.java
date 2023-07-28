package study01;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
		
		// 배열
		// 변수 -> 박스
		// 박스들을 이어놓은것
		// [] : 대괄호
		// 자료형[] 배열명 = new 자료형[크기]
		
		// String형
//		String[] str = new String[5];
//		Scanner scan = new Scanner(System.in);
//		for (int i=0; i<5; i++) {
//			str[i] = scan.next();
//		}
//		for (int i=0; i<5; i++) {
//			System.out.println(str[i]);
//		}
		
		
		
		// Str 배열 5개짜리, 사용자입력값이 배열에 들어있는지 없는지 찾아보는 프로그램
		
		Scanner scan = new Scanner(System.in);		
		
		String[] str = new String[5];
		String menu = scan.next();
	
		for (int i=0; i<5; i++) { //입력값받기
			if(menu.equals(str[i])) {
				System.out.println("있어용");
				break;
			} 
			if (i == 4) {
				System.out.println("없져용");
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
/*		int[] arr = new int[400];

		
		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;		
		for (int i=0; i<5; i++) {
			arr[i] = i+1;
		}

		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);		
/*		for (int i=0; i<400; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		int[] arr2 = new int[400];
		for (int i=1; i<400; i++) {
			arr[i] = i*2;
		}
		for (int i=0; i<400; i++) {
			arr[i] = i*2;
			System.out.print(arr[i]+" ");
		}

		
		System.out.println();
		int[] arr3 = {1,2,3,4,5,6,7,8,9};
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr[i]+" ");
		}
*/		
		
		
		// 학점입력시스템
		
/*		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i=0; i<5; i++)
		
//		int A = 0;
//		int B = 0;
//		int C = 0;
//		int D = 0;
//		int F = 0;
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
//				A++;
				arr[0]++;
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
		System.out.println("A : " + A + ", B : " + B + ", C : " + C + ", D : " + D + ", F : " + F);
		System.out.println("Max : " + max + ", Min : " + min);
*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
