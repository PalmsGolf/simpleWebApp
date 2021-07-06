package mike.springstart.simpleWebApp.repositories;

import mike.springstart.simpleWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
