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
		System.out.println(sentence.indexOf("f")); // 8
		System.out.println(sentence.indexOf("p")); // -1

	}

}

//String -> 변수가 아님
// 클래스 -> 객체
// srt은 객체였군

//public class String {
// char[] c;

// boolean equals(char c2) {

