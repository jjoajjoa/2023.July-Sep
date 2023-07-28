package study;

public class Variable {
	public static void main(String[] args) { 
		
			int num = 123;
			double f = -0.456;
			char c = 'a';
			String str = "Hello";
			String strr = "\"Hello\"";
			boolean b = true;
			
			System.out.print(num + "\n");
			System.out.print(num);
			System.out.print(num);
			System.out.print(f + "\n");
			System.out.print(c + "\n");
			System.out.print(str + "\n");
			System.out.print(strr + "\n");
			System.out.print(b + "\n");
			System.out.print("\n");
			System.out.println();
			System.out.print(num);
			
	}
}


// 변수
// 정수 [int(4byte), long(8byte), short(2byte), byte]
//	ㄴ 더 큰수 : short int~ (합쳐쓸수있음)
// 실수 [double(8byte), float(4byte)]
//	ㄴ 더 큰수 : long float~ (합쳐쓸수있음)
// 문자 'a' [char(1byte)]
// 문자열 "apple" [string]
// 불린 boolean <- 자바에선 b 소문자 <- True or False
// void <- 비어있움


