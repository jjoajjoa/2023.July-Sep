package Travel;

public class Kota extends TransferX {
// 추천계절 1~4월
	private static final String name = "KotaKinabalu";
	private static final double flightTimeK = 310; //비행시간(m)
	private static final double timeDiffK = 1; //시차(m)
	private static double exchangeK = 3.45; //환율
	
	Kota(String nation, String language) {
		super(nation, language);
	}
		
	@Override
	public void travelCourse() {
	
	}
	
	@Override
	public void activityRecom() {
	
	}
	
	@Override
	public void famousFood() {
	
	}
	
	@Override
	public void oneLineReview() {
	
	}

	@Override
	public String toString() {
		System.out.println();
		return super.toString() + name + "에서는 " + this.getLanguage() + "을 사용합니당!";
	}
	
	void arrivalTimeKota() {
		System.out.println();
		System.out.println(" * 도착시간 계산기 *");
		System.out.print(" * 출발hour을 입력해주세용!! (24시간 기준) : ");
		double departureH = scan.nextInt();
		System.out.print(" * 출발minute을 입력해주세용!! (24시간 기준) : ");
		double departureM = scan.nextInt();	
		//한국시간 기준
		double arrivalSum = (departureH*60)+departureM;
		double flightTime = (arrivalSum+flightTimeK);	
		int arrivalH = (int) flightTime /60;
		int arrivalM = ((int) flightTime) %60;		
		//현지시간 기준
		int arrivalHKt = (int) (arrivalH - timeDiffK); // H-1
		//도착시간 계산기
		String H = "";
		String HKt = "";
		String M = "";
		String DayK = "당 일";
		String DayKt = "당 일";
		
		if(arrivalH<10) {
			H += "0";
		}
		if(arrivalHKt<10) {
			HKt += "0";
		}
		
		if(arrivalH>=24) {
			DayK = "다음날";
			if(arrivalH<34) {
				H += "0";
			}
			H += (arrivalH-24);
		} else {
			H += arrivalH;
		}
		
		if(arrivalHKt>=24) {
			DayKt = "다음날";
			if(arrivalHKt<34) {
				HKt += "0";
			}
			HKt += arrivalHKt;
		} else {
			HKt += arrivalHKt;
		}
		
		if(arrivalM<10) {
			M += "0";
		}
		//출력
		System.out.println(" * 도착시간 (" + DayK + ")  " + H + " : " + M + arrivalM + "  (한국기준)");
		System.out.println(" * 도착시간 (" + DayKt + ")  " + HKt + " : " + M + arrivalM + "  (현지기준)");
	}
	
	void exchangeMoneyKota() {
		System.out.println();
		System.out.println(" * 환전 계산기 *");
		System.out.print(" * 얼마 가져가실건가용? (1,000원 이상) : ");
		double money = scan.nextInt();
		double exchangeKota = (money * exchangeK) / 1000;
		
		int count = 0; //콤마갯수
		int num = 1000; //천단위
		
//		System.out.println("환전금액: " + exchangeKota);
		
		while(exchangeKota > num) {
			num *= 1000;
			count++;
		}
		num /= 1000;
		
		System.out.print(" * 환전하면 ");
		while(exchangeKota>1000) { //환전금액이 천원보다 클때만
			System.out.print( ((int)exchangeKota) / num + "," ); //천단위에 콤마찍기
			exchangeKota %= num;
			num /= 1000;
		}
		System.out.print( (int)exchangeKota + "."); 
		System.out.print( (int) ( (exchangeKota - (int)exchangeKota) *100 %100 ) ); //소숫점 두자리 남기기
		System.out.print(" MYR 입니당!!");
		System.out.println();
	}
	
	
	
	
	
}
