package Travel;

public class Mauritius extends TransferO {
// 추천계절 5~11월
	private static final String name = "Mauritius";
	private static final double flightTimeM = 570; //비행시간(m)
	private static final double timeDiffM = 5; //시차(h)
	private static double exchangeM = 33.92; //환율
	
	Mauritius(String nation, String language) {
		super(nation, language);
	}
	
	@Override
	public String toString () {
		System.out.println();
		return super.toString() + name + "에서는 " + this.getLanguage() + "을 사용합니당!";
	}
	
	void arrivalTimeMauritius() {
		System.out.println();
		System.out.println(" * 도착시간 계산기 *");
		System.out.print(" * 출발hour을 입력해주세용!! (24시간 기준) : ");
		double departureH = scan.nextInt();
		System.out.print(" * 출발minute을 입력해주세용!! (24시간 기준) : ");
		double departureM = scan.nextInt();	
		//한국시간 기준
		double arrivalSum = (departureH*60)+departureM;
		double flightTime = (arrivalSum+flightTimeM);	
		int arrivalH = (int) flightTime /60;
		int arrivalM = ((int) flightTime) %60;		
		//현지시간 기준
		int arrivalHMr = (int) (arrivalH - timeDiffM); // H-5
		//도착시간 계산기
		String H = "";
		String HMr = "";
		String M = "";
		String DayK = "당 일";
		String DayMr = "당 일";
		if(arrivalH<10) {
			H += "0";
		}
		if(arrivalHMr<10) {
			HMr += "0";
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
		if(arrivalHMr>=24) {
			DayMr = "다음날";
			if(arrivalHMr<34) {
				HMr += "0";
			}
			HMr += arrivalHMr;
		} else {
			HMr += arrivalHMr;
		}
		
		if(arrivalM<10) {
			M += "0";
		}
		System.out.println(" * 도착시간 (" + DayK + ")  " + H + " : " + M + arrivalM + "  (한국기준)");
		System.out.println(" * 도착시간 (" + DayMr + ")  " + HMr + " : " + M + arrivalM + "  (현지기준)");
	}
	
	void exchangeMoneyMauritius() {
		System.out.println();
		System.out.println(" * 환전 계산기 *");
		System.out.print(" * 얼마 가져가실건가용? (1,000원 이상) : ");
		double money = scan.nextInt();
		double exchangeMr = (money * exchangeM) / 1000;
		int count = 0; 
		int num = 1000; 
		while(exchangeMr > num) {
			num *= 1000;
			count++;
		}
		num /= 1000;
		
		System.out.print(" * 환전하면 ");
		while(exchangeMr>1000) { //환전금액이 천원보다 클때만
			System.out.print( ((int)exchangeMr) / num + "," ); //천단위에 콤마찍기
			exchangeMr %= num;
			num /= 1000;
		}
		System.out.print( (int)exchangeMr + "."); 
		System.out.print( (int) ( (exchangeMr - (int)exchangeMr) *100 %100 ) ); //소숫점 두자리 남기기
		System.out.print(" MUR 입니당!!");
		System.out.println();
		
	}
	
}
