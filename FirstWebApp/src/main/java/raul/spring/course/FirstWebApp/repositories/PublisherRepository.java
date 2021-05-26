package raul.spring.course.FirstWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import raul.spring.course.FirstWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
