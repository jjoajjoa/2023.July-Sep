package Class0807;
// 영화 (제목, 상영시간)
// 1. 영화제목, 2. 상영시간 출력
// 2. 영화 장르 출력
// 영화 장르 2~3개 영화장르 출력 -> 메인에서 출력

public class Class011 {
	public static void main(String[] args) {
	
		Movie movie = new Movie("덩케르크", 105);
		SF sfMovie = new SF("반지의 제왕", 234);
		Romance romance = new Romance("타이타닉", 123);
		
		movie.movieInfo();
		movie.displayGenre();
		
		sfMovie.movieInfo();
		sfMovie.displayGenre();
		
		romance.movieInfo();
		romance.displayGenre();
		
	}
}
