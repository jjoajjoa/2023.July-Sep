package Travel;

public class Dubai extends Contry {

	static final double flightTimeD = 570; //비행시간(m)
	static final double timeDiffD = -300; //시차(m)
	static final double exchangeD = 357.4; //환율
	
//	Dubai() {
//		nation = "United Arab Emirates";
//	}
	
	void arrivalTimeDubai() { 
		System.out.print(" * 출발hour을 입력해주세용!! (24시간 기준) : ");
		double departureH = scan.nextInt();
		System.out.print(" * 출발minute을 입력해주세용!! (24시간 기준) : ");
		double departureM = scan.nextInt();
		//도착시간 계산기(한국시간)
		double arrivalMinute = (departureH*60)+departureM;
		double arrivalTime = (arrivalMinute+flightTimeD)/60;
		arrivalTime = Math.round(arrivalTime*100)/100.0;
		
		// 질문
		String arrivalTimeString = Double.toString(arrivalTime);
		String[] arrivalTimeSplited = arrivalTimeString.split(".",2);
		
		System.out.println(arrivalTimeSplited[0]); // 도착시간 실수
		
		
	}

	
}


//아랍에미리트
//언어 아랍어 영어
//이틀 사흘 나흘
	
//시차 한국 -5시간
//직항 9시간30분
//환율 AED 357.40원

//추천계절 11~3월
//