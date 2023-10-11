//2. equalsIgnoreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.
package Class0731;

public class Test05 {
	public static void main(String[] args) {
		String str1 = "HELLO world";
		String str2 = "hello worlD";

		System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
		
		if(str1.length() != str2.length()) {
			System.out.println(false);
			return;
		}
		
		System.out.println((int)'a'); //a : 97, A : 65
		int a = 'A';
		System.out.println(a);
		
		for(int i=0; i<str1.length(); i++) {
			int x = str1.charAt(i);
			int y = str2.charAt(i);
			
			if(x > 96) {
				x -= 32;
			}
			if(y > 96) {
				y -= 32;
			}
						
			if(x != y) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
}
