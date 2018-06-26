package pl.jakubowskiprzemyslaw.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakubowskiprzemyslaw.spring5webapp.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
