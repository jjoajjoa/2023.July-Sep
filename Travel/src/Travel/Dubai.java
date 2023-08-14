package Travel;

public class Dubai extends TransferX {
// 추천계절 11~3월
	private static final String name = "Dubai";
	private static final double flightTimeD = 570; //비행시간(m)
	private static final int timeDiffD = 5; //시차(h)
	private static double exchangeD = 2.77; //환율
	
	Dubai(String nation, String language) {
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
		System.out.println(" * ★★★★★ / 두바이를 경유지로만 사용하지 마라! / 익명");
	}
	
	@Override
	public String toString() {
		System.out.println();
		return super.toString() + name + "에서는 " + this.getLanguage() + "을 사용합니당!";
	}
	
	void arrivalTimeDubai() { //도착시간 계산기
		System.out.println();
		System.out.println(" * 도착시간 계산기 *");
		System.out.print(" * 출발hour을 입력해주세용!! (24시간 기준) : ");
		double departureH = scan.nextInt();
		System.out.print(" * 출발minute을 입력해주세용!! (24시간 기준) : ");
		double departureM = scan.nextInt();	
		//한국시간 기준
		double arrivalSum = (departureH*60)+departureM;
		double flightTime = (arrivalSum+flightTimeD);	
		int arrivalH = (int) flightTime /60;
		int arrivalM = ((int) flightTime) %60;		
		//현지시간 기준
		int arrivalHD = arrivalH - timeDiffD; // H-5
		//도착시간 계산기
		String H = "";
		String HD = "";
		String M = "";
		String DayK = "당 일";
		String DayD = "당 일";
		//도착이 다음날 일 때
		if(arrivalH < 10) {
			H += "0";
		}
		if(arrivalHD < 10) {
			HD += "0";
		}
		
		if (arrivalH >= 24) { //한국
			DayK = "다음날";
			if(arrivalH < 34) {
				H += "0";
			}
			H += (arrivalH-24);			
		} else {
			H += arrivalH;
		}		
		if(arrivalHD >= 24) { //두바이
			if(arrivalHD < 34) {
				HD += "0";
			}
			HD += (arrivalHD-24);
			DayD = "다음날";
		} else {
			HD += arrivalHD;
		}

		if(arrivalM < 10) {
			M += "0";
		}
		//출력
		System.out.println(" * 도착시간 (" + DayK + ")  " + H + " : " + M + arrivalM + "  (한국기준)");
		System.out.println(" * 도착시간 (" + DayD + ")  " + HD + " : " + M + arrivalM + "  (현지기준)");
	}
	
	void exchangeMoneyDubai () {
		System.out.println();
		System.out.println(" * 환전 계산기 *");
		System.out.print(" * 얼마 가져가실건가용? (1,000원 이상) : ");
		double money = scan.nextInt();
		double exchangeDubai = (money * exchangeD) / 1000;
		int count = 0;
		int num = 1000;
		
		while(exchangeDubai > num) {
			num *= 1000;
			count++;
		}
		num /= 1000;
		
		System.out.print(" * 환전하면 ");
		while(exchangeDubai > 1000) {
			System.out.print(((int)exchangeDubai)/num + ",");
			exchangeDubai %= num;
			num /= 1000;
		}
		System.out.print((int)exchangeDubai + ".");

		System.out.print((int)((exchangeDubai-(int)exchangeDubai)*100%100));
		System.out.println(" AED 입니당!");
		
	}
}



