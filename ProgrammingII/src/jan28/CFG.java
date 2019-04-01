package jan28;

import java.util.ArrayList;
import java.util.List;

public class CFG {
	public static void main(String[] args) {

		// Creating the Objects of Book class.
		Book b1 = new Book("ty ujfyjjhgh Java", "Joshua Bloch");
		Book b2 = new Book("dghjdghjd in Java", "Bruce Eckel");
		Book b3 = new Book("Java: dghjdg Complete Reference", "Herbert Schildt");
		Book b4 = new Book("Java: dghjdg Complete Reference", "Herbert Schildt");

		// Creating the list which contains the
		// no. of books.
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);

		Library library = new Library(books);

		List<Book> bks = library.getTotalBooksInLibrary();
		for (Book bk : bks) {

			System.out.println("Title : " + bk.getTitle() + " and " + " Author : " + bk.getAuthor());
		}
	}
}
