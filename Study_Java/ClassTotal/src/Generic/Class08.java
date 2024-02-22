package Study01;
public class Class08 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("a : " + a + ", b : " + b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a + ", b : " + b);
		
		String[] str = {"apple", "banana", "kiwi", "mango", "orange"};
		printArray(str);
		SwapArray.swap(str, 1, 3);
		printArray(str);
		
		Integer[] arr = {1,2,3,4,5};
		printArray(arr);
		SwapArray.swap(arr, 3, 4);
		printArray(arr);
	}
	
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

//매개변수(배열, 숫자, 숫자) -> 숫자에 해당하는 인덱스 위치에 있는 두 값의 자리를 서로 변경해주자.
class SwapArray {
	public static <T> void swap(T[] arr, int i, int j) {
		if(i>=0 && i<arr.length && j>=0 && j<arr.length) {
			T temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		else {
			System.out.println("IndexOutOfBoundsException");
		}
	}
}