package pl.jakubowskiprzemyslaw.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakubowskiprzemyslaw.spring5webapp.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
