package apr1;

//Vickie Wu
//April 1


import java.util.ArrayList;

public class PetTestDemo {

	public static void main(String[] args) {

		Pet cat = new Cat("Sam");
		Pet dog = new Dog("Daisy");
		Pet loudDog = new LoudDog("Tucker");
		
		Kennel k = new Kennel();
		ArrayList<Pet> list = new ArrayList<Pet>();
		list.add(cat);
		list.add(dog);
		list.add(loudDog);
		k.setPetList(list);
		
		k.allSpeak();
	}

}
