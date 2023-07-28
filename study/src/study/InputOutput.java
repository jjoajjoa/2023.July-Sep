package study;

import java.util.Scanner; //

public class InputOutput {

	public static void main(String[] args) {
		
		
/*		Scanner scan = new Scanner(System.in); // 그냥 스캐너는 오류뜸 
		
		int a; // 변수 선언
		double d = 123.123; // 변수 선언과 초기화
		//a = 12; // 변수 초기화
		//a = a + 100; // 초기화 이전엔 알수없는 숫자들이 들어가있음.
		
		a= scan.nextInt();
		System.out.println("a : " + a);
		
		d = scan.nextDouble();
		System.out.println("d : " + d);	
		
		String str;
		str = scan.next();
		System.out.println("str : " + str);
		
		scan.nextLine();
		str = scan.nextLine();
		System.out.println("str : " + str);			*/


		Scanner scan = new Scanner(System.in);
		
		
		// 실습01
		// 실수 두개를 입력받고, 두개의 합을 출력하기
/*		double a;
		double b;
		double c;
		a = scan.nextDouble();
		// System.out.println("a : " + a);
		b = scan.nextDouble();
		// System.out.println("b : " + b);	
		c = a+b;
		System.out.println("두 수의 합 : " + c);			*/
		
		double a, b;
		System.out.print("실수 두개 입력 : ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		System.out.println("두 수의 합 : " + (a+b));
		
		
		// 실습02
		// 철수영희 둘다100점시 성공
		int i; //철수점수
		int j; //영희점수
		i = scan.nextInt();
		//System.out.println("철수점수 : " + i);
		j = scan.nextInt();
		//System.out.println("영희점수 : " + j);
		boolean x = i==100 && j==100;
		//System.out.println(x);
		System.out.println("철수 : " + i +"점, " + "영희 : " + j +"점, " + "성공 : " + x);

		
	}

}


// 출력: System.out
// 입력: System.in




