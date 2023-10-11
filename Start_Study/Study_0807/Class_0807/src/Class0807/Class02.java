package Class0807;

public class Class02 {

	public static void main(String[] args) {
		Moviee movie = new Moviee("기생충", 132);
		//Moviee movie2 = new Moviee();
		
		movie.playMovie();
		//System.out.println(movie.title + movie.duration); 정보 은닉 성공
		//movie.duration += 10;
		
		movie.setDuration(142);
		System.out.println(movie.getTitle() + movie.getDuration());
	}

}


// 캡슐화 Encapsulation
// 객체지향 프로그래밍에서 사용되는 개념
// 객체의 상태를 보호하기 위해
// 데이터(변수)와 기능(메서드)를 하나로 묶는 것을 뜻함
// 보안성 - 외부에서 객체 내부에 직접적으로 접근하는 것을 제한
// 			ㄴ  객체 무결성 유지 및 사용방법 간소화
// 캡슐화 이후에는 당연히 내부상태를 외부에서 직접 수정 할 수 없음

// 접근 제한자 Access Modifier
// 		pubilc*, private*, protected, default
// pubilc: 모든 코드에서 접근가능
// private: 해당 클래스 내부에서만 접근가능
// protected: 동일 패키지 내에서는 모두 접근가능, 외부 패키지에서는 상속받은 클래스 내부에서만 접근 가능
// default: 동일패키지 내에서만 접근가능

// 정보 은닉 Information hiding 의 목적으로 캡슐화를 하는 것
// private int num
// 가장빡셈: 메서드로 접근해야 함
// getNum(), setNum(int num) <- getter, setter 메서드
// getter, setter: 인스턴스 변수의 값을 변경하는 역할
//  	 ㄴ 정보은닉을 유지하고 외부에서도 피요한 데이터에 접근을 가능하게 함
