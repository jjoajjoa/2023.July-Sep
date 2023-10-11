package Travel;
import java.util.ArrayList;
public class TravelCourse {

	void courseKota() {
		System.out.println();
		ArrayList<String> landmarkKtList = new ArrayList<>();
		landmarkKtList.add("Jesselton Point");
		landmarkKtList.add("Likas Mosque");
		landmarkKtList.add("Mt. Kinabalu");
		landmarkKtList.add("Water Front");
		landmarkKtList.add("Tanjung Aru Beach");
		landmarkKtList.add("Filipino Market");
		
		ArrayList<String> selectedList = new ArrayList<>();
		
		for (int i=landmarkKtList.size()-1; i>2; i--) {
			int choice = (int) (Math.random()*i);
			selectedList.add(landmarkKtList.get(choice));
			landmarkKtList.remove(choice);
		}
		System.out.print(" * 관광지로는 ");
		for (int i=0; i<selectedList.size(); i++) {
			System.out.print((i+1) + ". " + selectedList.get(i) + " ");
		}
		System.out.print("를 추천드립니다!");
		System.out.println();
	}
	
	void courseDubai() {
		System.out.println();
		ArrayList<String> landmarkDList = new ArrayList<>();
		landmarkDList.add("Burj Khalifa");
		landmarkDList.add("Jumeirah Public Beach");
		landmarkDList.add("Jumeirah Mosque");
		landmarkDList.add("Dubai Mall");
		landmarkDList.add("Al Fahidi Street");
		landmarkDList.add("Old Souk");
		
		ArrayList<String> selectedList = new ArrayList<>();
		
		for (int i=landmarkDList.size()-1; i>2; i--) {
			int choice = (int) (Math.random()*i);
			selectedList.add(landmarkDList.get(choice));
			landmarkDList.remove(choice);
		}
		System.out.print(" * 관광지로는 ");
		for (int i=0; i<selectedList.size(); i++) {
			System.out.print((i+1) + ". " + selectedList.get(i) + " ");
		}
		System.out.print("를 추천드립니다!");
		System.out.println();
	}
	
	void courseMauritius() {
		System.out.println();
		ArrayList<String> landmarkMrList = new ArrayList<>();
		landmarkMrList.add("Le Morne Beach");
		landmarkMrList.add("Chamarel Seven Coloured Earth Geopark");
		landmarkMrList.add("Notre Dame Auxiliatrice");
		landmarkMrList.add("Pamplemousses Botanical Garden");
		landmarkMrList.add("Port Louis Central Market");
		landmarkMrList.add("Chamarel Waterfalls");		
		
		ArrayList<String> selectedList = new ArrayList<>();
		
		for (int i=landmarkMrList.size()-1; i>2; i--) {
			int choice = (int) (Math.random()*i);
			selectedList.add(landmarkMrList.get(choice));
			landmarkMrList.remove(choice);
		}
		System.out.print(" * 관광지로는 ");
		for (int i=0; i<selectedList.size(); i++) {
			System.out.print((i+1) + ". " + selectedList.get(i) + " ");
		}
		System.out.print("를 추천드립니다!");
		System.out.println();
	}
	

	
}
