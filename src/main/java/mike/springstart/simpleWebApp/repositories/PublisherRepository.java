package mike.springstart.simpleWebApp.repositories;

import mike.springstart.simpleWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
