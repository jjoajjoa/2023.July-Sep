package class_0801;

import java.util.ArrayList;

public class Resto_print {

	public static void main(String[] args) {
		
//		Resto res = new Resto();
//		res.printRes();
		
		Korean korean = new Korean();
//		korean.printRes();
		
//		Mexican mexi = new Mexican();
//		mexi.printRes();
		
		Korean kor1 = new Korean("한국", "백반집", 5, "순찌", 8000);
//		kor1.printRes();
		
//		String[] menu = {"타코1", "타코2", "타코3"};
//		int[] price = {1000, 2000, 3000};
//		Mexican mexi1 = new Mexican("멕시코", "타코집", 3, menu, price);
//		mexi1.printRes();
//		
//		mexi1.setPoint(1);
//		mexi1.setPoint(1);
//		mexi1.setPoint(1);
//		mexi1.setPoint(1);
//		mexi1.setPoint(1);
//		mexi1.printRes();
		
		
		
//		Korean[] korea = new Korean[5];
		
		//어레이리스트 풀이
		ArrayList<Korean> koreaList = new ArrayList<>();
		System.out.println("size: " + koreaList.size()); //0
		koreaList.add(korean);
		System.out.println("size: " + koreaList.size()); //1
		koreaList.add(kor1);
		System.out.println("size: " + koreaList.size()); //2
		
		
		
		//원래 했던 방법
		Korean kor3 = new Korean("한국", "국밥", 4, "국밥", 6000); // 만들고
		koreaList.add(kor3);									// 넣어줌
		
		// 새로운 방법(+어레이리스트)
		koreaList.add(new Korean("한국", "김밥", 4, "김밥", 4000)); // 만들면서 집어넣음
		
		System.out.println(koreaList.get(2)); // class_0801.Korean@76a3e297 <- 메모리주소 나옴
		
		System.out.println(koreaList.get(2).name); // 국밥

		koreaList.remove(2); // 국밥집 삭제
		System.out.println("size: " + koreaList.size()); // 4개 -> 3개: 제대로 삭제됨

		System.out.println("-------하나하나---------------------------------");
		
		// ㄴ 코리아리스트 예쁘게 syso 해보기
		koreaList.get(0).printRes(); // 객체(koreaList.get(0))도 리턴 가능
		koreaList.get(1).printRes();
		koreaList.get(2).printRes();
		System.out.println("-------배운거써먹---------------------------------");
		for(int i=0; i<koreaList.size(); i++) {
			koreaList.get(i).printRes();
		}
		
		
		
		
		
		
	}

}

// 객체는 배열에 못넣나?
// String[] -> 객체 배열

// 배열(Array) List(파이썬)
// ArrayList
// 객체 밖에 못넣음
// 배열의 단점: 사이즈를 지정해줘야함
// ArrayList: 사이즈 유동적!

// ArrayList<객체> 어레이리스트명 = new ArrayList<>(); <- 크기 필요X








