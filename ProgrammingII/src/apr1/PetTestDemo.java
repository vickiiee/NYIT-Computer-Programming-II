package apr1;

//Vickie Wu
//April 1

import java.util.ArrayList;

public class PetTestDemo {

	public static void main(String[] args) {

		//create 3 pets
		Pet cat = new Cat("Sam");
		Pet dog = new Dog("Daisy");
		Pet loudDog = new LoudDog("Tucker");

		//create kennel object
		Kennel k = new Kennel();
		
		//add 3 pet obj to petList
		ArrayList<Pet> list = new ArrayList<Pet>();
		list.add(cat);
		list.add(dog);
		list.add(loudDog);
		k.setPetList(list);

		//call allspeak method
		k.allSpeak();
	}

}
