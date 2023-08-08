package Food;
//식당 + 좌석수, 소비자 -> 예약자명, 인원수
//남은좌석 수보다 인원수가 많으면 예약불가
//오버라이딩 캡슐화 사용
public class Main_ {

	public static void main(String[] args) {
		
		//생성자
		Restaurant restaurant = new Restaurant(); //빈괄호 기본생성자 
				
//		F_Korean korean = new F_Korean();
		F_Korean koreanSeat = new F_Korean(20);
		
		Customer customer = new Customer();
		Customer customer1 = new Customer("김쪼랭", 15);
		Customer customer2 = new Customer("김메롱", 4);
		Customer customer3 = new Customer("김야호", 2);
		Customer customer4 = new Customer("김덕철", 1);
		
		F_Japanese jap = new F_Japanese();
		
		F_American ame = new F_American();
		
		
		//식당
		String[] menuK = {"순찌", "김찌", "부찌"};
		int[] priceK = {5000, 7000, 9000};
		F_Korean koMePr = new F_Korean("한국","김백반집", 5, menuK, priceK);
		koMePr.printKoMePr(); //메뉴쭉	
		koreanSeat.korSeat(); //식당남은좌석
		koreanSeat.getSeat(); //???식당남은좌석
		koreanSeat.printFood(); //오늘의메뉴
		System.out.println("----------------------");		
		customer1.customerMem();
		customer2.customerMem();
		customer3.customerMem();
		customer4.customerMem();
		System.out.println("----------------------");
		
		koreanSeat.korCome(customer1, koreanSeat);
		koreanSeat.korCome(customer2, koreanSeat);
		koreanSeat.korCome(customer3, koreanSeat);
		koreanSeat.korCome(customer4, koreanSeat);
		
		
//		if (customer1.getMember() <= koreanSeat.getSeat()) {
//			System.out.println(customer1.getName() + "님 예약 가능");
//			koreanSeat.getSeat() -= customer1.getMember();
//			System.out.println("남은 좌석 수: " + koreanSeat.getSeat());
//		} else {
//			System.out.println(customer1.getName() + "님 예약 불가능");
//		}
//		System.out.println("----------------------");
		
		
		
//		if (customer2.getMember() <= koreanSeat.seat) {
//			System.out.println(customer2.getName() + "님 예약 가능");
//			koreanSeat.seat -= customer2.getMember();
//			System.out.println("남은 좌석 수: " + koreanSeat.seat);
//		} else {
//			System.out.println(customer2.getName() + "님 예약 불가능");
//		}	
//		System.out.println("----------------------");
//		
//		if (customer3.getMember() <= koreanSeat.seat) {
//			System.out.println(customer3.getName() + "님 예약 가능");
//			koreanSeat.seat -= customer3.getMember();
//			System.out.println("남은 좌석 수: " + koreanSeat.seat);
//		} else {
//			System.out.println(customer3.getName() + "님 예약 불가능");
//		}	
//		System.out.println("----------------------");	
			
			
			
			
			
		
		
		
		
			
		
		
		
		
	}
}



//		if(koreanSeat.seat > customer1.member) {
//			System.out.println(customer1.name + "님 예약가능");
//		} else {
//			System.out.println(customer1.name + "님 예약 불가능");
//		}
//		
//		if(koreanSeat.seat > customer2.member) {
//			System.out.println(customer2.name + "님 예약가능");
//		} else {
//			System.out.println(customer2.name + "님 예약 불가능");
//		}


//		System.out.println("----------------------");
//		String[] menuA = {"치즈", "패티", "더블"};
//		int[] priceA = {5000, 7000, 9000};	
//		F_American amMePr = new F_American("미국","햄버거집",3,menuA,priceA);
//		amMePr.printAmMePr();
//		System.out.println("----------------------");
//		String[] menuJ = {"초밥", "라멘", "우동"};
//		int[] priceJ = {5000, 7000, 9000};	
//		F_Japanese jaMePr = new F_Japanese("일본","아리가또",4,menuJ,priceJ);
//		jaMePr.printJaMePr();