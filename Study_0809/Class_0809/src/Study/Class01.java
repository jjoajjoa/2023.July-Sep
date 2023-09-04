package Study;

public class Class01 {

	public static void main(String[] args) {
		System.out.println(Counter.count);
		
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		
		System.out.println(counter1.count);
		System.out.println(counter2.count);
		System.out.println(counter3.count);
		
		int result = MathUtils.sum(5, 3);
		System.out.println(result);
		
		printCount();
		
	}

	static void printCount() {
		System.out.println("카운트: ");
	}
	
}

class Counter{
	static int count = 0;
	
	Counter() {
		count++;
	}
}

class MathUtils{
	static int sum(int a, int b) {
		return a+b;
	}
}

// 정적 static
// 메모리 직접 저장 <위치공유>: 클래스 수준에서 공유

// 지금까지 -> Monster monster = new Monster();
// 지금까지 -> monster.변수, monster.메서드()

// static 사용 -> Monster.변수, Monster.메서드()
// static이 쓰인건 static에서 가져와야함
// 인스턴스(객체) 생성 없이 직접 클래스 이름을 통해서 접근 가능
// 속성(인스턴스 변수), 행동(메서드)

// 정적 변수
// 클래스 수준에서 공유되는 변수
// 객체 생성 - 객체1, 객체2

// 정적 메서드
// 공통동작

// 싱글톤 Singleton
// = 정적 생성자

// 1. 학생: 23 22 21 20 학번 <- 
