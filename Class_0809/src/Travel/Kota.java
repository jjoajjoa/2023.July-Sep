package Travel;

public class Kota extends TransferX {
// 추천계절 1~4월
	static final double flightTimeK = 310; //비행시간(m)
	static final double timeDiffK = -60; //시차(m)
	static final double exchangeK = 287.7; //환율
	
	private String nation;
	private String language;
	
	Kota(String nation, String language) {
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
	
}
