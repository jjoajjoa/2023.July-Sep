package Study01;
import java.util.Arrays;
import java.util.List;

public class Class13 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		printList(list);
		System.out.println(sum(list));
	}

	public static double sum(List<? extends Number> numbers) {
		double total = 0;
		for(Number number : numbers) {
			total += number.doubleValue();
		}
		return total;
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}


// 와일드카드 ?
// 자바에서 unknown Type

// 제한된 와일드
// <? extends T>  <? super T> 제네릭 타입을 제한

// 비한정적 와일드
// <?> 모든 객체를 처리 가능 (읽기 전용)

// 원시 타입
// 자바의 호환성을 유지하기 위해 남아있는 와일드 카드(이제 거의 사용 안함)
