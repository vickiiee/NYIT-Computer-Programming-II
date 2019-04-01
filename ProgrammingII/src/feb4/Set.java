package feb4;

//Vickie Wu
//February 18
import java.util.Scanner;

public class Set {
	private int[] setArray;
	private int numElements;
	final int DEFAULT_SIZE = 5;

	public Set() {
		setArray = new int[DEFAULT_SIZE];
		numElements = 0;
	}

	public Set(int arr[]) {
		setArray = new int[DEFAULT_SIZE];
		numElements = 0;
		for (int i = 0; i < setArray.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (isElement(arr[j]) == false) {
					if (numElements >= setArray.length) {
						Set nArr = new Set(setArray);
						setArray = new int[nArr.setArray.length + DEFAULT_SIZE];
						for (int k = 0; k < nArr.setArray.length; k++) {
							setArray[k] = nArr.setArray[k];
						}
						numElements = nArr.setArray.length;
						setArray[numElements] = arr[j];
						numElements++;
					} else {
						setArray[numElements] = arr[j];
						numElements++;
					}
				}
			}
		}
	}

	public void displaySet() {
		System.out.print("{");
		for (int i = 0; i < numElements; i++) {
			if (i == numElements - 1) {
				System.out.print(setArray[i]);
			} else {
				System.out.print(setArray[i] + ",");
			}
		}
		System.out.println("}");

	}

	public Set(Set a) {
		setArray = a.setArray;
		numElements = a.numElements;
	}

	public boolean isElement(int e) {
		for (int i = 0; i < numElements; i++) {
			if (setArray[i] == e)
				return true;
		}
		return false;
	}

	public void addElement(int n) {
		if (isElement(n))
			return;

		if (numElements == setArray.length) {
			int[] newArray = new int[setArray.length + DEFAULT_SIZE];

			for (int i = 0; i < numElements; i++)
				newArray[i] = setArray[i];
			setArray = newArray;
		}
		setArray[numElements] = n;
		numElements++;

	}

	public void populate() {
		Scanner userInput = new Scanner(System.in);
		int x = userInput.nextInt();
		while (x != -1) {
			if (isElement(x) == false) {
				if (numElements >= setArray.length) {
					Set nSet = new Set(setArray);
					setArray = new int[(nSet.setArray.length) + DEFAULT_SIZE];
					for (int i = 0; i < nSet.setArray.length; i++) {
						setArray[i] = nSet.setArray[i];
					}
					setArray[numElements] = x;
					numElements++;
				} else {
					setArray[numElements] = x;
					numElements++;
				}
			}
			x = userInput.nextInt();
		}

	}

	public int getLength() {
		return numElements;
	}

	public void remove(int n) {
		for (int i = n; i < numElements - 1; i++)
			setArray[i] = setArray[i + 1];
		numElements--;
	}

	public Set union(Set s) {
		int len = getLength() + s.getLength();
		Set setOne = new Set(setArray);
		Set setTwo = new Set(setArray);
		setTwo.setArray = new int[len];

		for (int i = 0; i < setOne.setArray.length; i++) {
			setTwo.setArray[i] = setOne.setArray[i];
		}

		for (int j = 0; j < s.getLength(); j++) {
			if ((setTwo.isElement(s.setArray[j])) == false) {
				setTwo.setArray[setOne.numElements] = s.setArray[j];
				setTwo.numElements++;
			}
		}
		return setTwo;
	}

	public Set intersection(Set arr) {
		Set setTwo = new Set();
		setTwo.setArray = new int[setArray.length];
		int k = 0;
		for (int i = 0; i < setArray.length; i++) {
			for (int j = 0; j < arr.getLength(); j++) {
				if (setArray[i] == arr.setArray[j]) {
					setTwo.setArray[k] = setArray[i];
					setTwo.numElements++;
					k++;
					break;
				}
			}
		}
		return setTwo;
	}

	public int getElements() {
		return numElements;
	}

	public Set difference(Set setTwo) {
		Set setDif = new Set();

		for (int i = 0; i < numElements; i++) {
			if (!(setTwo.isElement(setArray[i])))
				setDif.addElement(setArray[i]);
		}
		return setDif;
	}

	public boolean equals(Set arr) {
		if (setArray == arr.setArray)
			return true;
		return false;
	}
}
