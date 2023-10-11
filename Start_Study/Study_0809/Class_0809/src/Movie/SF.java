package Movie;
// 장르소개
public class SF extends Movie {
	
	SF(String Title, int time) {
		super(Title, time);
	}
	
	@Override
	void displayGenre() {
		System.out.println("장르: SF");
	}

}
