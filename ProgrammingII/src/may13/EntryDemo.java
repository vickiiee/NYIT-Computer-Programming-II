package may13;

public class EntryDemo {
	public static void main(String[] args) {
		Entry<String, String> letterGrade = new Entry<String, String>("Mark", "A");
		Entry<String, Integer> numberGrade = new Entry<String, Integer>("Mark", 100);
		System.out.println("Letter grade: " + letterGrade);
		System.out.println("Number grade: " + numberGrade);

		Entry<Integer, Boolean> prime = new Entry<Integer, Boolean>(13, true);
		if (prime.getS())
			System.out.println(prime.getF() + " is prime.");
		else
			System.out.println(prime.getF() + " is not prime.");
	}
}