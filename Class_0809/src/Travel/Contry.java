package Travel;
import java.util.Scanner;
public class Contry {
	Scanner scan = new Scanner(System.in);
	private String nation;
	private String language;
	private String landmark;

	
	
	String getNation() {
		return nation;
	}
	
	String getLanguage() {
		return language;
	}
	
	String getLandmark() {
		return landmark;
	}
	
	
	
	

	
	void intro () {
		System.out.println("         *  *");
		System.out.println(" * 인천발 여행지 추천해드립니다!");
		System.out.println(" * 어디로 떠나고 싶으세요?");
		System.out.println(" * 코타키나발루 / 두바이 / 모리셔스");
	}
	
}
