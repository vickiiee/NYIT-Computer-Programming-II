package apr1;

//Vickie Wu
//April 1

public class LoudDog extends Dog {

	public LoudDog(String name) {
		super(name);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return super.speak() + " " + super.speak();
	}

}
