package Travel;

public class Mauritius extends TransferO {
// 추천계절 5~11월
	static final double flightTimeM = 570; //비행시간(m)
	static final double timeDiffM = -300; //시차(m)
	static final double exchangeM = 45.6; //환율
	
	Mauritius(String nation, String language) {
		super(nation, language);
	}
	
	@Override
	public String toString () {
		return super.toString() + " Mauritius에서는 " + this.getLanguage() + "을 사용합니당!";
	}
	
}
