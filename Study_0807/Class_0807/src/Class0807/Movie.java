package Class0807;
// 요소: 제목 상영시간
// 행동: 영화소개 장르소개
public class Movie {
	
	String title;
	int time;
	
	Movie(String title, int time) {
		this.title = title;
		this.time = time;
	}
	
	void movieInfo() {
		System.out.println("영화: " + title + ", 상영시간: " + time);
	}
	
	
	void displayGenre() {
		System.out.println("장르: 알 수 없음");
	}
	
}
