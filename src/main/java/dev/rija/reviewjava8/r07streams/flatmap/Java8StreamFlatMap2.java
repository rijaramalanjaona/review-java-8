package dev.rija.reviewjava8.r07streams.flatmap;

import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This example uses .stream() to convert a List into a stream of objects,
 * and each object contains a set of books,
 * and we can use flatMap to produces a stream containing all the book in all the objects.
 *
 * In the end, we also filter out the book containing the word 'python' and collect a Set to remove the duplicated book.
 */
public class Java8StreamFlatMap2 {
	public static void main(String[] args) {
		List<Developer> developers = getDevelopers();
		
		Set<String> filteredBooks = developers.stream()
				.map(dev -> dev.getBooks())
				.flatMap(books -> books.stream())
				.filter(book -> !book.toLowerCase().contains("python"))
				.collect(Collectors.toSet());
		
		/*Set<String> filteredBooks = developers.stream()
				.map(Developer::getBooks)
				.flatMap(Collection::stream)
				.filter(book -> !book.toLowerCase().contains("python"))
				.collect(Collectors.toSet());*/
		System.out.println(filteredBooks); // [Spring Boot in Action, Effective Java (3nd Edition), Java 8 in Action]
		
		// .map(dev -> dev.getBooks()) is optional
		Set<String> filteredBooks2 = developers.stream()
				.flatMap(dev -> dev.getBooks().stream())
				.filter(book -> !book.toLowerCase().contains("python"))
				.collect(Collectors.toSet());
		System.out.println(filteredBooks2); // [Spring Boot in Action, Effective Java (3nd Edition), Java 8 in Action]
	}
	
	private static List<Developer> getDevelopers() {
		Developer dev1 = new Developer();
		dev1.setId(1);
		dev1.setName("mkyong");
		dev1.addBook("Java 8 in Action");
		dev1.addBook("Spring Boot in Action");
		dev1.addBook("Effective Java (3nd Edition)");
		
		Developer dev2 = new Developer();
		dev2.setId(2);
		dev2.setName("zap");
		dev2.addBook("Learning Python, 5th Edition");
		dev2.addBook("Effective Java (3nd Edition)");
		
		return Arrays.asList(dev1, dev2);
	}
}

@Data
class Developer {
	private Integer id;
	private String name;
	private Set<String> books;
	
	public void addBook(String book) {
		if (books == null) {
			books = new HashSet<>();
		}
		books.add(book);
	}
}
