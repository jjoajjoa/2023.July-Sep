package Travel;
import java.util.ArrayList;
public class TravelCourse {

//	private int choice = (int) Math.random()*6 +1;
	
	void courseKota() {
		System.out.println();
		ArrayList<String> landmarkKt = new ArrayList<>();
		landmarkKt.add("Jesselton Point");
		landmarkKt.add("Likas Mosque");
		landmarkKt.add("Mt. Kinabalu");
		landmarkKt.add("Water Front");
		landmarkKt.add("Tanjung Aru Beach");
		landmarkKt.add("Filipino Market");
		
		
		for (int i=0; i<3; i++) {
			int choice = (int) Math.random()*6 +1;
			
			
			System.out.println(landmarkKt.get(choice));
		}
		
	}
	
	void courseDubai() {
		System.out.println();
		ArrayList<String> landmarkD = new ArrayList<>();
		landmarkD.add("Burj Khalifa");
		landmarkD.add("Jumeirah Public Beach");
		landmarkD.add("Jumeirah Mosque");
		landmarkD.add("Dubai Mall");
		landmarkD.add("Al Fahidi Street");
		landmarkD.add("Old Souk");
		
		for (int i=0; i<3; i++) {
			System.out.println(landmarkD.get(i));
		}
		
	}
	
	void courseMauritius() {
		System.out.println();
		ArrayList<String> landmarkMr = new ArrayList<>();
		landmarkMr.add("Le Morne Beach");
		landmarkMr.add("Chamarel Seven Coloured Earth Geopark");
		landmarkMr.add("Notre Dame Auxiliatrice");
		landmarkMr.add("Pamplemousses Botanical Garden");
		landmarkMr.add("Port Louis Central Market");
		landmarkMr.add("Chamarel Waterfalls");		
		
		for (int i=0; i<3; i++) {
			System.out.println(landmarkMr.get(i));
		}
		
	}
	

	
}
