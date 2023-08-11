package Travel;
import java.util.Scanner;
public class Country {
	Scanner scan = new Scanner(System.in);
	String nation;
	private String language;
	private String activity;
	private String food;

	Country() {
		
	}
	
	Country(String nation, String language) {
		this.nation = nation;
		this.language = language;
	}
	
	String getNation() {
		return nation;
	}
	
	String getLanguage() {
		return language;
	}
	
	@Override
	public String toString () {
		return " * " + nation + "에 위치한";
	}

	void intro () {
		System.out.println("         *  *");
		System.out.println(" * 인천발 여행지 추천해드립니다!");
		System.out.println(" * 어디로 떠나고 싶으세요?");
		System.out.print(" * 코타키나발루 / 두바이 / 모리셔스 -> ");
	}
	

	
	
	
	
}
