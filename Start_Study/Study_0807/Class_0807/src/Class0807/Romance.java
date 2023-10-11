package Class0807;
//장르소개
public class Romance extends Movie {
	
	Romance(String Title, int time) {
		super(Title, time);
	}
	
	@Override
	void displayGenre() {
		System.out.println("장르: 로맨스");
	}
	
}
