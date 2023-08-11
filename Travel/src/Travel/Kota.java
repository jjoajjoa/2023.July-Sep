package Travel;

public class Kota extends TransferX {
// 추천계절 1~4월
	static final double flightTimeK = 310; //비행시간(m)
	static final double timeDiffK = -60; //시차(m)
	static final double exchangeK = 287.7; //환율
	
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
	public String toString () {
		return super.toString() + " KotaKinabalu에서는 " + this.getLanguage() + "을 사용합니당!";
	}
	
	
	
	
	
	
	
	
	
}
