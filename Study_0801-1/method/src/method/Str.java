package method;

public class Str {

	public static void main(String[] args) {
		

		String greeting = "Hello";
//		String sentence = "Professor";
		String sentence = greeting + "Professor";
		
		System.out.println(sentence); // HelloProfessor
		System.out.println(sentence.length()); // 14
		System.out.println(sentence.toLowerCase()); // helloprofessor
		System.out.println(sentence.toUpperCase()); // HELLOPROFESSOR
		System.out.println(greeting.replace('l', 'z')); // Hezzo
		System.out.println(greeting.substring(2)); // llo       :: substring(n)   -> n부터 끝까지
		System.out.println(sentence.substring(2,9)); // lloProf :: substring(a,b) -> a부터 b 전까지
		
		System.out.println(sentence.charAt(4)); // o
		System.out.println(sentence.indexOf("l")); // 2 : 문자열에서 가장 앞에있는 애
		System.out.println(sentence.indexOf("p")); // -1
		System.out.println(sentence.lastIndexOf("l")); // 3 : 가장 뒤에있는 애
		
		System.out.println(greeting.concat(sentence)); // HelloHelloProfessor
		System.out.println(greeting.equals("Hello")); // true
		System.out.println(greeting.equals("hello")); // false
		System.out.println(greeting.equalsIgnoreCase("hello")); // true :: 대소문자 구분 X
		System.out.println(greeting.compareTo("Aello")); // 7   :: H보다 A가 7번째 앞에있음
		System.out.println(greeting.compareTo("Hello")); // 0   ::
		System.out.println(greeting.compareTo("Hezzo")); // -14 :: l보다 z가 14번째 뒤에있음
		
		
	}

}

//String -> 변수가 아님
// 클래스 -> 객체
// srt은 객체였군

//public class String {
// char[] c;

// boolean equals(char c2) {

