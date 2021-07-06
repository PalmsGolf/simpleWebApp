package mike.springstart.simpleWebApp.repositories;

import mike.springstart.simpleWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
