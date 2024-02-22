package Study01;
import java.util.ArrayList;

public class Class12 {
	public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<>();
		ArrayList<Cat> cat = new ArrayList<>();
		ArrayList<RedCat> red = new ArrayList<>();
		ArrayList<Dog> dog = new ArrayList<>();
		
		addCat(animal);
		addCat(cat);
		//addCat(red);
		//addCat(dog);
	}
	
	public static void addCat(ArrayList<? super Cat> catList) {
		catList.add(new RedCat());
		System.out.println("myaaa");
	}
}

class Animal {}

class Cat extends Animal{}
class RedCat extends Cat{}

class Dog extends Animal{}