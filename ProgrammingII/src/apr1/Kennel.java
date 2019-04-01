package apr1;

//Vickie Wu
//April 1

import java.util.ArrayList;

public class Kennel {

	private ArrayList<Pet> petList;

	// name, speak --> print one line per pet
	public Kennel() {
		// TODO Auto-generated constructor stub
	}

	public void allSpeak() {
		for (int i = 0; i < petList.size(); i++) {
			System.out.print(petList.get(i).getName() + ": " + petList.get(i).speak() + "\n");
		}
	}

	public void setPetList(ArrayList<Pet> petList) {
		this.petList = petList;
	}

}
