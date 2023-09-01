package Travel;
import java.util.ArrayList;
import java.util.Scanner;

public class Review implements InterfaceReview {
	
	Scanner scan = new Scanner(System.in);
	ArrayList <String> Review = new ArrayList<>();
	
	Review() {
		
	}
	
	Review(String name, int star) {
		
	}
	
	@Override
	public void printReview() {
		System.out.print(" * 한줄평: ");
		String oneLine = scan.nextLine();
		Review.add(oneLine);
		
	}
	
}
