package jan28;

import java.util.List;

//Vickie Wu
public class Library {

	private List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {

		return books;

	}
}