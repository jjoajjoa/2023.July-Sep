package study;

public class Class05 {

	String species;
	String name;
	int age;
	
	void speak() {
		System.out.println("얘는 " +species+" "+name+"이고, "+age+"살이야.");
	}
	
	void wlk() {
		if(species.equals("강아지")) {
			System.out.println(name+"이(가) 산책을 갑니다.");			
		}
		else if(species.equals("고양이")) {
			System.out.println(name+"이(가) 높은 곳에 올라갑니다.");
		}
		else if(species.equals("새")) {
			System.out.println(name+"이(가) 종이를 뜯어 몸을 치장합니다.");
		}
	}
	void slp() {
		if(species.equals("강아지")) {
			System.out.println(name+"이(가) 배를 보이며 잠을 잡니다.");
		}
		else if(species.equals("고양이")) {
			System.out.println(name+"이(가) 웅크리고 잠을 잡니다.");
		}
		else if(species.equals("새")) {
			System.out.println(name+"이(가) 횟대에서 잠을 잡니다.");
		}
	}
	void trt() {
		if(species.equals("강아지")) {
			System.out.println(name+"이(가) 개껌을 먹습니다.");
		}
		else if(species.equals("고양이")) {
			System.out.println(name+"이(가) 츄르를 먹습니다.");
		}
		else if(species.equals("새")) {
			System.out.println(name+"이(가) 모이를 먹습니다.");
		}
	}

} //클래스 끝




// 상속
//  ㄴ 클래스 간의 관계 (상하만 가능)
// 내가 가지고있는 속성(인스턴스 변수), 행동(메소드)이 다른 클래스에도 이미 있다면?
// 똑같이 생긴 설계도(클래스)를 또 만들어야 되네?????
// 그래서.. 다른 설계도를 베껴올 수 있엇음 좋겠당

// 부모클래스 (이미 만들어져 있는 설계도)
// 자식클래스 (베껴서 새로 작성할 설계도)

