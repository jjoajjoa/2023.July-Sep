package Home;
import java.util.Scanner;

//조건문 기초실습, 심화실습
public class Class02 {

	public static void main(String[] args) {
		
	// 입력 받기 -> 조건문을 통해 "? 입니다."로 출력
	// 1: 가위, 2: 바위, 3:보자기
		
		//입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("무엇을 내시겠습니까? 숫자를 선택해주세용");
		System.out.println("1: 가위, 2: 바위, 3:보자기");
		int x = scan.nextInt(); //선택한 숫자가 x에 들어감
		
		//조건문 만들기 1 (switch)
		switch(x) {
		case 1:
			System.out.println("가위를 내셨내용");
			break;
		case 2:
			System.out.println("바위를 내셨내용");
			break;
		case 3:
			System.out.println("보자기를 내셨내용");
			break;		
		default:
			System.out.println("잘못 입력하셨슴당");		
		}
		
		//조건문 만들기 2 (switch)
		if(x == 1) {
			System.out.println("가위를 내셨내용");
		} else if(x == 2) {
			System.out.println("바위를 내셨내용");
		} else if (x == 3) {
			System.out.println("보자기를 내셨내용");
		} else {
			System.out.println("잘못 입력하셨슴당");	
		}
				

	} // 메인함수 끝

} // 클래스 끝







//			int a = 4;
//			if(10 < a) {
//				System.out.println("하잉");
//			} else if(a > 8) {
//				System.out.println("빠잉");
//			} else {
//				System.out.println("메롱");
//			}



//	int num = 12;
//	switch(num) {
//	case 12:
//		System.out.println(num);
//		break;
//	case 1:
//		num *= 10;
//		break;
//	case -5:
//		--num;
//		break;
//	//		case 10.25: 
//	case (int)10.25:
//		System.out.println(num<2);
//	break;
//	//		case "메롱":
//	case 'a':
//		System.out.println("무야호");
//		break;
//	default:
//		System.out.println("끝!");
//	//			break; :: 어차피 마지막이라서
//	}