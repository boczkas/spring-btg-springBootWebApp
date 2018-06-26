package pl.jakubowskiprzemyslaw.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakubowskiprzemyslaw.spring5webapp.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
