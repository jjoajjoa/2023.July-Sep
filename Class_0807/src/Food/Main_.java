package Food;
//식당 + 좌석수, 소비자 -> 예약자명, 인원수
//남은좌석 수보다 인원수가 많으면 예약불가
//오버라이딩 캡슐화 사용
public class Main_ {

	public static void main(String[] args) {
		
		//생성자
		Restaurant restaurant = new Restaurant(); //빈괄호 기본생성자 
		
		Customer customer1 = new Customer("김쪼랭", 3);
		Customer customer2 = new Customer("김메롱", 5);
		
		F_Korean korean = new F_Korean();
		F_Korean koreanSeat = new F_Korean(4);
		
		F_Japanese jap = new F_Japanese();
		
		F_American ame = new F_American();
		
		
		//식당
		String[] menuK = {"순찌", "김찌", "부찌"};
		int[] priceK = {5000, 7000, 9000};
		F_Korean koMePr = new F_Korean("한국","김백반집", 5, menuK, priceK);
		koMePr.printKoMePr();
		korean.korSeat();
		
		
		
		System.out.println("----------------------");
		String[] menuA = {"치즈", "패티", "더블"};
		int[] priceA = {5000, 7000, 9000};	
		F_American amMePr = new F_American("미국","햄버거집",3,menuA,priceA);
		amMePr.printAmMePr();
		System.out.println("----------------------");
		String[] menuJ = {"초밥", "라멘", "우동"};
		int[] priceJ = {5000, 7000, 9000};	
		F_Japanese jaMePr = new F_Japanese("일본","아리가또",4,menuJ,priceJ);
		jaMePr.printJaMePr();
		
		
		
		
	}
}




