package Study01;
public class Class01 {
	public static void main(String[] args) {

	}
}

//제네릭(generic) - 데이터 타입을 일반화한다.
//클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시 미리 지정하는 방법

//타입 안정성 : 클래스나 메소드 내부에서 사용되는 객체타입의 안정성을 높일 수 있다.
//재사용성 : 통일된 코드 여러 타입에 사용할 수 있으므로 여러 데이터 타입에 대한 코드를 짤 필요가 없어진다.
//컴파일시 타입 검사 : 컴파일 시점에서 타입 정보를 확인하므로 실행 시점의 형변환 오류를 방지한다.

//1. 제네릭 클래스(Generic Class)
//2. 제네릭 메서드(Generic Method)
//3. 제한된 타입 매개변수(Bounded Type Parameters)
//4. 와일드카드(Wildcards)

class MyArray<T> {
	T element;
	void setElement(T element) {
		this.element = element;
	}
	T getElement() {
		return element;
	}
}

// T : 타입 변수(type variable)
//제네릭 클래스를 선언할 때는 타입 변수자리에 실제 타입을 명시하여야 한다.
MyArray<Integer> myarr = new MyArray<Integer>();
