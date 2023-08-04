package restaurant;
import java.util.ArrayList;

public class Main_ {

	public static void main(String[] args) {
		
		//생성자
		Restaurant restaurant = new Restaurant(); //빈괄호 기본생성자 
		
		F_Korean korean = new F_Korean();
		F_Japanese jap = new F_Japanese();
		F_American ame = new F_American();
		
		//식당
//		Restaurant restK = new Restaurant("한국"); 
//		Food foodK = new Food("한국","백반집");
//		Food foodKs = new Food("한국","백반집", 5);
		String[] menuK = {"순찌", "김찌", "부찌"};
		int[] priceK = {5000, 7000, 9000};
//		restK.printRes(); //한국
//		foodK.printFood();//한국백반
		F_Korean koMePr = new F_Korean("한국","백반집", 5, menuK, priceK);
		koMePr.printKoMePr();
		
//		Restaurant restA = new Restaurant("미국"); 
//		Food foodA = new Food("미국","햄버거집");
//		Food foodAs = new Food("미국","햄버거집",3);
		String[] menuA = {"치즈", "패티", "더블"};
		int[] priceA = {5000, 7000, 9000};	
//		restA.printRes(); //미국
//		foodA.printFood();//미국햄버거
		F_American amMePr = new F_American("미국","햄버거집",3,menuA,priceA);
		amMePr.printAmMePr();
				
//		Restaurant restJ = new Restaurant("일본"); 
//		Food foodJ = new Food("일본","아리가또");
//		Food foodJs = new Food("일본","아리가또",1);
		String[] menuJ = {"초밥", "라멘", "우동"};
		int[] priceJ = {5000, 7000, 9000};	
//		restJ.printRes(); //일본
//		foodJ.printFood();//일본아리가또
		F_Japanese jaMePr = new F_Japanese("일본","아리가또",1,menuJ,priceJ);
		jaMePr.printJaMePr();
		
		System.out.println("---------진짜여기----------");			
		
		
		//생성자
		Cafe cafe = new Cafe(); //
		
		C_Twosome twosome = new C_Twosome("한국","투썸",4,"아메리카노",5000);
		ArrayList<C_Twosome> twosomeList = new ArrayList<>();
		twosomeList.add(twosome);
		System.out.println(twosomeList.get(1));
		
		

		
		
		//카페
		
//		ArrayList<C_Twosome> twosomeList = new ArrayList<>();
//		
//		ArrayList<C_Starbugs> starbugsList = new ArrayList<>();
//		
//		
//		starbugsList.add(new C_Starbugs());
//		starbugsList.add(new C_Starbugs());
//		starbugsList.add(new C_Starbugs());
//		
//		starbugsList.get(0); //arr[0]
//		
//		starbugsList.remove(0);
//		
		System.out.println("---------지금여기----------");

		
		
		
		
		
		restaurant.printRes(); //국가 : 123
//		food.printFood(); //국가 : 456, 이름 : 789
		korean.printKorean(); //국가 : 456, 이름 : 789, 평점 : 0
		

		
		
		
		
		
		
		
		
		
		
		korean.printRes();
		
		jap.printRes();
		
		ame.printRes();
		
		F_Korean kor2 = new F_Korean("대한민국", "한식당", 5, "백반", 5000);
		kor2.printRes();
		
		String[] menu = {"초밥", "라멘", "우동"};
		int[] price = {10000, 8000, 6000};
		F_Japanese jap2 = new F_Japanese("일본", "일식당", 4, menu, price);
		jap2.printRes();
		
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.setPoint(1);
		jap2.printRes();
		
		ArrayList<F_Korean> koreaList = new ArrayList<>();
		System.out.println("size : " + koreaList.size());
		koreaList.add(korean);
		System.out.println("size : " + koreaList.size());
		koreaList.add(kor2);
		System.out.println("size : " + koreaList.size());
		
		F_Korean kor3 = new F_Korean("대한민국", "국밥", 3, "국밥", 6000);
		koreaList.add(kor3);
		
		koreaList.add(new F_Korean("대한민국", "김밥", 4, "김밥", 4000));
		
		System.out.println(koreaList.get(2).name);
		koreaList.remove(2);
		
		System.out.println("size : " + koreaList.size());
		
		koreaList.get(0).printRes();
		koreaList.get(1).printRes();
		koreaList.get(2).printRes();
		
		System.out.println("---------------------------------");
		
		for(int i=0; i<koreaList.size(); i++) {
			koreaList.get(i).printRes();
		}
	}
}

//객체는 배열에 못넣나?
//String[] -> 객체 배열

//배열(Array) List
//ArrayList
//객체 밖에 못넣는다.
//배열의 단점 : 사이즈를 지정해줘야 한다.
//ArrayList는 사이즈가 유동적이다.

//ArrayList<객체> 어레이리스트명 = new ArrayList<>();




