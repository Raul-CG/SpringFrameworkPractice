package raul.spring.course.FirstWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import raul.spring.course.FirstWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
