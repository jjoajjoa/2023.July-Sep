package study;

import java.util.Scanner;

public class Prac_1 {

	public static void main(String[] args) {
		
		
		int money;
		String menu;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("콜라 1000 사이다 1200 제로 1500");
		System.out.println("금액을 넣어주세용");
		money = scan.nextInt();
		System.out.println("메뉴 선택해용");
		menu = scan.next();
		
		switch(menu) {
		case "콜라":
			if (money >= 1000) {
				System.out.println("콜라용 거스름돈은 " + (money-1000) + "원 입니당.");
			}
			else {
				System.out.println("돈이 부족함용");
			}
			break;
		case "사이다":
			if (money >= 1200) {
				System.out.println("사이다용 거스름돈은 " + (money-1000) + "원 입니당.");
			}
			else {
				System.out.println("돈이 부족함용");
			}
			break;
		case "제로":
			if (money >= 1500) {
				System.out.println("제로용 거스름돈은 " + (money-1000) + "원 입니당.");
			}
			else {
				System.out.println("돈이 부족함용");
			}
			break;
		}

	}

}






//실습01: 분식자판기
//금액을 넣어주세요: (입력)
//메뉴를 선택하세요: (메뉴1 -> 가격), (메뉴2 -> 가격) ... (입력)메뉴선택
//잔액이 부족합니다. or (메뉴)가 나왔습니다. 거스름돈은 @@원 입니다.
		
/*		Scanner scan = new Scanner(System.in);
		
		int won;
		System.out.print("금액을 넣어주세요 : ");
		won = scan.nextInt(); // 넣은 돈 = won
		System.out.println("금액을 확인하세요 : " + won + "원");
		System.out.println("메뉴를 확인하세요");
		
		int kim = 5000;
		int tteok = 3000;
		int soon = 4000; 
		System.out.println("1.김밥 : " + kim + "원, 2.떡볶이 : " + tteok + "원, 3.순대 : " + soon + "원");
		
		String menu;
		menu = scan.next();
		
		if("김밥".equals(menu)) {
//		if(menu == "김밥") {		
			if (won>kim) {
				System.out.println("김밥 나왔습니다. 거스름돈 : " + (won-kim) + "원");
			} else {
				System.out.println("잔액이 부족합니다.");
			}	
		}
		
		if("떡볶이".equals(menu)) {
//		if(menu == "떡볶이") {		
			if (won>tteok) {
				System.out.println("떡볶이 나왔습니다. 거스름돈 : " + (won-tteok) + "원");
			} else {
				System.out.println("잔액이 부족합니다.");
			}	
		}
		
		if("순대".equals(menu)) {
//		if(menu == "순대") {
			if (won>soon) {
				System.out.println("순대 나왔습니다. 거스름돈 : " + (won-soon) + "원");
			} else {
				System.out.println("잔액이 부족합니다.");
			}		
		}
*/
