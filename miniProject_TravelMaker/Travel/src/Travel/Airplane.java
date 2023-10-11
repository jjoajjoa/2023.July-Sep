package Travel;
import java.util.Scanner;
public class Airplane {

	Scanner scan = new Scanner(System.in);
	private String seatInfo;
	private int seatNum;
	
	Airplane() {
		seatInfo = "";
		seatNum = 0;
	}
	
	Airplane(String seatInfo, int seatNum) {
		this.seatInfo = seatInfo;
		this.seatNum = seatNum;
	}
	
	
	void airplaneInfo() {
		System.out.println();
		System.out.println(" * " + this.seatInfo + "항공을 찾아주셔서 감사합니당, 남은 좌석 수는 " + this.seatNum + " 입니닷!");
	}
	
	void airplaneSetting() {
		System.out.println();
		System.out.println(" * 예약자분 성함과 인원수, 몇월에 떠나시길 원하는지 적어주세요!");
		System.out.print(" * 성함: ");
		String name = scan.nextLine();
		System.out.print(" * 인원수(숫자만 기입): ");
		int member = scan.nextInt();
		System.out.print(" * 떠나고싶은 월(숫자만 기입): ");
		int season = scan.nextInt();
		
		if (season == 11 || season == 12 || season == 1 || season == 2 || season == 3) {
			System.out.println(" * " + season + "월은 성수기입니다! 비행기 가격이 1.7배 입니다 ㅎㅎ");
		} 
		
		if(this.seatNum >= member) {
			System.out.println(" * " + name + "님, 예약가능합니다!!");
			System.out.println(" * 남은 좌석수: " + (this.seatNum-member) );
		} else {
			System.out.println(" * 좌석이 부족합니다 ㅜㅜ");
		}
		
	}
	
	
}
