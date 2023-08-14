package Travel;
import java.util.ArrayList;
import java.util.Scanner;
public class MainTravel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//처음세팅
		Country country = new Country("어쩌구", "저쩌구");
		Kota kota = new Kota("Malaysia", "Malay");
		Dubai dubai = new Dubai("United Arab Emirates", "Arabic");
		ArrayList<Dubai> landmarkD = new ArrayList<>();
		Mauritius mauritius = new Mauritius("Africa", "Franch");

		Airplane airplane = new Airplane();
		Airplane airplaneEmirates = new Airplane("Emirates", 9);
		Airplane airplaneAirSeoul = new Airplane("AirSeoul", 4);
		Airplane airplaneKoreanAir = new Airplane("KoreanAir", 12);
		
		
		country.intro();
		String wanna = scan.nextLine();		
		if (wanna.equals("코타")||wanna.equals("코타키나발루")) {
			System.out.println();
			System.out.println(kota.toString());
			
		} else if (wanna.equals("두바이")) {
			airplaneEmirates.airplaneInfo();
			airplaneEmirates.airplaneSetting();
			System.out.println(dubai.toString());
			dubai.arrivalTimeDubai();
			dubai.exchangeMoneyDubai();
		} else if (wanna.equals("모리셔스")) {
			System.out.println();
			System.out.println(mauritius.toString());
			
		} else { 
			System.out.println("다시 입력해주숑");
		}
		
		
		
		
		
		
		
		
	}

}

