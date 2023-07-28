package study;

public class Operator {

	public static void main(String[] args) {

		
		// 산술연산자
		//사칙(산술)연산자: +, -, *, /, %(나머지)
		System.out.println(5+2); // 7
		System.out.println(5-2); // 3
		System.out.println(5*2); // 10
		System.out.println(5/2); // 2
		System.out.println(5.0/2); // 2.5
		System.out.println(5%2); // 1
		
		// 비교연산자
		//비교연산자: <, >, <=, >=, ==, !=(같지않움)
		System.out.println(5<6); // t
		System.out.println(5>6); // f
		System.out.println(5<=6); // t
		System.out.println(5>=6); // f
		System.out.println(5==6); // f
		/// 부정연산자
		System.out.println(!(5==5)); // f		
		
		
		int a = 1;
		int b = 2;
		System.out.println(a+b); // 3
		System.out.println(a*b); // 2
		System.out.println(!(a==b)); // t
		

		// 논리연산자
		//논리연산자: &&(and), ||(or) <- 원화 슬레싀
		/// b가 1보다 크고 10보다 작은지?
		//System.out.println(1<b<10); <- 이건 안됨, 이거실행하면 t, 왼쪽부터 순서대로 실행(1<b)하기때문에 
		System.out.println(1<b && b<10); // 비교연산자 사용해야함		
		/// a, b 둘 중 하나라도 음수인지 확인해보기
		//System.out.println(a,b < 0); <- X
		System.out.println(a<0 || b<0); // f
		
		
		// 대입연산자
		//대입연산자: = : a = b -> 우항의 '값'을 좌항에 대입한다는 뜻
		/// num_123에 100 더하기
		int num_123 = 123;
		// num_123 = 123 + 100;
		// num_123 = num_123 + 100;
		num_123 += 100;
		System.out.println(num_123); // 223
		
		
		// 증감연산자: 전위후위증가감소
		System.out.println(num_123++); // 223
		System.out.println(++num_123); // 225
		System.out.println(num_123);   // 225
		System.out.println(num_123--); // 225
		System.out.println(--num_123); // 223
		System.out.println(num_123);   // 223
	}

}


//연산자
//사칙(산술)연산자: +, -, *, /, %(나머지)
//비교연산자: <, >, <=, >=, ==, !=(같지않움)
//부정연산자: !
//논리연산자: &&(and), ||(or) <- 원화 슬레싀
//대입연산자: = : a = b -> 우항의 '값'을 좌항에 대입한다는 뜻
//변수선언: 자료형 변수명 = 값
//식별자: 숫자가 제일 앞에 올 수 없음, 특수문자 언더바(_)만 사용가능
//컴이 쓰는 단어들은 사용못함
//변수: 전부 소문자 | 클래스,함수: 첫글자대문자 | 폴더명: 전부대문자 
// ㄴ snake: helloWorld | ㄴ camel: Print  <- 표기법의 종류
//증감연산자: 값을 증가, 감소 시킴 : +=, -=, *=, /=, %= : 자기자신에게
//			++: 1씩 더함, --: 1씩 뺌
//			전위증가 전위감소: ++num, --num | 후위증가 후위감소: num++, num--
//비트연산자: &, |
// 주석 | /*어쩌구*/ : 어쩌구가 주석됨 | 컨트롤슬래시 전부주석
