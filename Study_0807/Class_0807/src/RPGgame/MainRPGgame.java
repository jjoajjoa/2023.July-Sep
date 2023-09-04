package RPGgame;
import java.util.Scanner;
// RPG게임
// 유닛 - 캐릭터 몬스터
public class MainRPGgame {

	public static void main(String[] args) {
		//처음세팅
		Scanner scan = new Scanner(System.in);
		System.out.println("         ~ 어드벤쳐타임 ~");		
		System.out.print("[system] 닉네임을 입력해주세용! ");
		String nickName = scan.nextLine();
		System.out.println("[system] " + nickName + "님, 직업을 선택해주세요~! ");
		System.out.print("[system] 도적 // 법사  ");
		
		Job jobJOB = new Job();
		jobJOB.jobChoice();
		String x = jobJOB.getJob();
		System.out.println("---- " + x + " " + nickName + "님의 모험을 시작합니다 ----");
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////////////////		
				
		//기초세팅
//		Unit unitChar = new Unit(nickName, 5000, 10);		
//		Unit unitMon1 = new Unit("다람쥐", 1000, 10);
//		Unit unitMon2 = new Unit("토끼", 500, 5);
		
		Character character1 = new Character(nickName, 5000, 100, 0);
		Moster monster1 = new Moster("다람쥐", 1000, 50);
		Moster monster2 = new Moster("토깽이", 500, 10);
		
//		System.out.println(unitChar.getName());
//		System.out.println(unitMon1.getName());
//		System.out.println(unitMon2.getName());

		character1.infoChar();
		monster1.InfoMon();
		monster2.InfoMon();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
