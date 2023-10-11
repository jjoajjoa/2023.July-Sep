package Travel;

public class Dubai extends TransferX {
// 추천계절 11~3월
	static final double flightTimeD = 570; //비행시간(m)
	static final double timeDiffD = -300; //시차(m)
	static final double exchangeD = 357.4; //환율
	
	private String nation;
	private String language;
	
	Dubai(String nation, String language) {
	this.nation = nation;
	this.language = language;
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
	public String toString () {
		return this.getNation() + " dubai에서는 " + this.getLanguage() + "을 사용합니당!";
	}

	
//	void arrivalTimeDubai() { //도착시간 계산기
//		System.out.println(" * 도착시간 계산기 *");
//		System.out.print(" * 출발hour을 입력해주세용!! (24시간 기준) : ");
//		double departureH = scan.nextInt();
//		System.out.print(" * 출발minute을 입력해주세용!! (24시간 기준) : ");
//		double departureM = scan.nextInt();
//		//한국시간 기준
//		double arrivalMinute = (departureH*60)+departureM;
//		double arrivalTime = (arrivalMinute+flightTimeD)/60;		
//		System.out.println(arrivalTime); //확인용
//		int arrivalH = arrivalTime;
//		int arrivalM = arrivalTime%60;
//	}
		
		

	
}

// 질문
//		arrivalTime = Math.round(arrivalTime*100)/100.0;
//		String arrivalTimeString = Double.toString(arrivalTime);
//		String[] arrivalTimeSplited = arrivalTimeString.split(".",2);
//		System.out.println(arrivalTimeSplited[0] + " " + arrivalTimeSplited[1]); 


