package study;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		
		
		int a = 5;
		int b = 5;
		
		
/*		if(a == 5 && b==5) {
			System.out.println("a는 5다.");
		}
		else {
			System.out.println("a는 5가 아니다.");
		}
		
		
		if(a==5) {
			System.out.println("a는 5다.");
			if(b==5) {
				System.out.println("b도 5다.");
			}
			else {
				System.out.println("b는 5가 아니다.");
			} 
			else if (a==6) {
				System.out.println("a도 6다.");
				if(b==6) {
					System.out.println("b도 6다.");
				}
				else {
					System.out.println("b는 6가 아니다.");
				}
			}
			
		}														*/
		
		
		
		
		// 숫자 판별 홀짝음양
		Scanner scanner = new Scanner(System.in);
/*		a = scanner.nextInt();
		if (a>0) {
			System.out.println("a 양수");
			if (a%2 == 0) {
				System.out.println("a 짝수");
			} else {
				System.out.println("a 홀수");
			}
		} else if (a<0) {
			System.out.println("a 음수");
			if (a%2 == 0) {
				System.out.println("a 짝수");
			} else {
				System.out.println("a 홀수");
			}
		} else {
			System.out.println("a 0");
		}				*/

		


////////////////////////////////////////////////////////////////////////////////////////////////	
		
//		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		
		
// switch문: 길어질수록 if문보다 속도가 빨라짐, 일대일대응
		switch(a) {
		case 1:
			System.out.println("a는 1이다.");
			break;
		case 2:
			System.out.println("a는 2이다.");
			break;
		case 3:
			System.out.println("a는 3이다.");
			break;
		default:
			System.out.println("a는 1,2,3이 아니다.");
		}
		
		
// if문
		if (a==1) {
			System.out.println("a는 1이다.");
		} else if (a==2) {
			System.out.println("a는 2이다.");
		} else if (a==3) {
			System.out.println("a는 3이다.");
		} else {
			System.out.println("a는 1,2,3이 아니다.");
		}															
		
		
		
		String str = (a%2==0) ? "짝수" : "홀수";
		System.out.println(str);
		
		
		
	}

}



//조건문

// 	if문
// 	if(조건식) {
//  	코드 -> 조건식이 참일 때 실행
// 	}
// 	else {
//  	코드 -> 이전 조건식이 거짓일 때 실행
// 	}

// if(조건1) {
// 		조건1이 참일때 실행
//  }
// else if(조건2) {
// 		조건1이 거짓, 조건2가 참일때 실행
//  }
// else if(조건3) {
//		조건1,2이 거짓, 조건3이 참일때 실행
//  }
// else if(조건4) {
//  	조건1,2,3이 거짓, 조건4가 참일때 실행
//  }
// else {
//  	조건 1,2,3,4가 모두 거짓일때 실행
//  }

// switch(변수) {
//		case 1 : 코드
//		case 2 : 코드
//		case 3 : 코드
//		case 4 : 코드
//		default : 코드
//  }

// 삼항연산자: if문을 한줄로 쓰는거
// 변수 = (조건) ? 값1 : 값2;
//		String str = (a%2==0) ? "짝수" : "홀수";
//		System.out.println(str);








