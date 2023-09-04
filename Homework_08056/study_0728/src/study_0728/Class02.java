package study_0728;
public class Class02 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("i : " + i + ", j : " + j);
				if(j == 5) {
					break;
				}
			}
		}

		for(int i=0; i<=100; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=10; i>=0; i--) {
			if(i==0) {
				System.out.println("발사!!");
				break;
			}
			System.out.println(i);
		}
	}
}








