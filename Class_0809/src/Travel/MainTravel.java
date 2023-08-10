package Travel;
import java.util.Scanner;
public class MainTravel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//처음세팅
		Country country = new Country();
		Dubai dubai = new Dubai("United Arab Emirates", "Arabic");
		
		
		country.intro();
		System.out.println();
		
		System.out.println(dubai.toString());
		
		
		
	}

}






//		dubai.arrivalTimeDubai(); //확인 후 삭제

//		String wanna = scan.nextLine();
//			if (wanna.equals("두바이")) {
//				dubai.arrivalTimeDubai();
//			} else if () {
//				
//			} else if () {
//				
//			} else {
//				
//			}