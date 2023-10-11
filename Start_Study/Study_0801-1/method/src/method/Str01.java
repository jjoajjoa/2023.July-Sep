package method;
import java.util.Scanner;

public class Str01 {
	public static void main(String[] args) {
		
		
		// 1. 모든 문장은 마침표로 마무리된다는 가정하에 length 사용하지 않고 입력값 총 길이 출력
		System.out.println("-----입력값 총 길이 출력-----"); 
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력해주세요 : "); 
		String userInput = scan.nextLine();	// apple apple.	
		int a = userInput.lastIndexOf(".");
		System.out.println("총 " + a + " 글자: lIO"); // 11
		// 1. 풀이
		int index = 0;
		int cnt = 0;
		while(true) { // 무한루프 
			//cnt++; <- 여기에있으면 마침표 포함해서 세줌
			if(userInput.charAt(index)== '.') {
				break;
			}
			cnt++;
			index++;
		}
		System.out.println("총 " + cnt + " 글자: cnt");
		
		
		// 2. equalsIgnoreCase 사용하지 않고 2개 문자열을 서로 비교하기
		System.out.println("-----문자열 비교-----");		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("첫번째 문장을 입력해주세요 : ");
		String userInput1 = scan1.nextLine();
		System.out.print("두번째 문장을 입력해주세요 : ");
		String userInput11 = scan1.nextLine();	
		if (userInput1.equals(userInput11)) {
			System.out.println("**두 문장이 같아용**");
		} else {
			System.out.println("**두 문장이 달라용**");
		}
		// 2. 풀이
		System.out.println("-----문자열 비교2-----");
		String str1 = "Hello world";
		System.out.println(str1);
		String str2 = "hello worlD";
		System.out.println(str2);		
//		System.out.println(str1.toLowerCase() == str2.toLowerCase()); <- 변수 아니라 == 안됨
//		System.out.println(str1.toLowerCase().equals(str2.toLowerCase())); // true
		if (str1.toLowerCase().equals(str2.toLowerCase())) {
			System.out.println("**두 문장이 같아용**");
		}
		// 2. 풀이2
		System.out.println("-----문자열 비교3-----");		
		if(str1.length() != str2.length()) { // 두문장 길이가 다르면 걍 끝내라
			System.out.println(false);
			return;
		}
		///// 대소문자 아스키로 확인해서 비교해보기
//		System.out.println((int)'a'); // 97
//		int z = 'A'; 
//		System.out.println(z); // 65
		
		for (int i=0; i<str1.length(); i++) {
			int x = str1.charAt(i);
			int y = str2.charAt(i);
			
			if(x>96) {
				x-= 32;
			}
			if(y>96) {
				y -= 32;
			}
			if(x != y) {
				System.out.println(false);
				return;
			}			
		}
		System.out.println(true); // true
		

		
		
		// 3. 문자열에 indexOf 사용하면 특정 위치 알수있었는데, 그러면 해당 문자열 원하는 문자가 몇개있는지
		// ㄴ 원하는 바: 단어를 쪼개서 같은 아스키코드값이 나오면 카운드 해주기
//		System.out.println("-----특정문자 갯수-----");		
//		Scanner scan2 = new Scanner(System.in);
//		String[] str = new String[1];
//		System.out.print("문장을 입력해주세요 : "); 
//		String userInput2 = scan2.nextLine(); // "banana" = userInput2
//		System.out.print("몇개인지 알고싶은 문자를 입력해주세요 : ");
//		String userInput22 = scan2.nextLine(); // "a" = userInput22	
//		int count = 0;
//		for (int i=0; i<=userInput2.length(); i++) {
//			if(userInput22.equals(str[i])) {
//				count++;
//				System.out.println("같은 문자는 총 " + count + " 글자"); // 3 <- a 3개
//				break;
//			} else {
//				System.out.println("같은문자 없어용");
//			}
//		}
		// 3. 풀이
		System.out.println("-----특정문자 갯수2-----");		
		String strr = "hello world";
		int countt = 0;
		for(int i=0; i<strr.length(); i++) {
			if(strr.charAt(i) == 'l') {
				countt++;
			}
		}
		System.out.println(countt);
		// 3. 풀이2
		System.out.println("-----특정문자 갯수3-----");			
		Scanner sc = new Scanner(System.in);
		countt = 0;
		String s = sc.next();
		for(int i=0; i<strr.length(); i++) {
			//1.char로 바꿔서 해보기
//			if(strr.charAt(i) == s.charAt(0)) { // 한글자라서 0
//				countt++;
//			}
			
			//2.어떻게하면 둘다 스트링으로 바꿔서 비교할 수 있을까
			if (s.equals(strr.substring(i,i+1))) { //(0,1)첫글자 (1,2)둘쨋글자
				countt++;				
			}
		}
		System.out.println(countt);
		
		//인덱스오브 사용해보기
		System.out.println("-----특정문자 갯수4-----");	
		cnt = 0;
		while(strr.length() > 0) {
			if(strr.indexOf('l') != -1) {
				cnt++;
				strr = strr.substring(strr.indexOf('l') + 1);
			} else {
				break;
			}
		}
		System.out.println(cnt);
		
		strr = "Hello world";
		cnt = 0;
		for(int i=0; i<strr.length(); i++) {
			if (strr.indexOf('l', i) != -1) {
				i = strr.indexOf('l', i);
				cnt++;
			} else {
				break;				
			}
		}
		System.out.println(cnt);
		
	}
}
