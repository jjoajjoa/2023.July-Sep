package Travel;

abstract class TransferX extends Country {
	
	abstract void travelCourse();
	abstract void activityRecom();
	abstract void famousFood();
	abstract void oneLineReview();
	
	TransferX(String nation, String language) {
		super(nation, language);
	}

}
