package raul.spring.course.FirstWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import raul.spring.course.FirstWebApp.domain.Author;
import raul.spring.course.FirstWebApp.domain.Book;
import raul.spring.course.FirstWebApp.repositories.AuthorRepository;
import raul.spring.course.FirstWebApp.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository	authorRepository;
	private final BookRepository	bookRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "2342425");

	}

}
