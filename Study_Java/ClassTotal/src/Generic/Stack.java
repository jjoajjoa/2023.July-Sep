package Study01;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {
	public static void main(String[] args) {
		GenericStack<Integer> gs = new GenericStack<>();
		gs.push(11);
		gs.push(22);
		gs.push(33);
		System.out.println(gs.peek());
		System.out.println(gs.pop());
		System.out.println(gs.peek());
		
		GenericStack<String> strStack = new GenericStack<>();
		strStack.push("hello");
		strStack.push("world");
		System.out.println(strStack.peek());
		System.out.println(strStack.pop());
		System.out.println(strStack.peek());
	}
}

class GenericStack<T> {
	private ArrayList<T> stack;
	
	public GenericStack() {
		stack = new ArrayList<>();
	}
	
	void push(T item) {
		stack.add(item);
	}
	
	T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			return stack.remove(stack.size() -1);			
		}
	}
	
	T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			return stack.get(stack.size() -1);			
		}
	}
	
	boolean isEmpty() {
		return stack.isEmpty();
	}
}


//Stack을 구현해보자 LIFO

//arraylist.add() 제일 뒤에 추가
//arratlist.remove() 특정 인덱스 삭제

//stack.push() 제일 뒤에 추가
//stack.pop() 제일 뒤가 삭제
//stack.peek() 제일 뒤에 조회