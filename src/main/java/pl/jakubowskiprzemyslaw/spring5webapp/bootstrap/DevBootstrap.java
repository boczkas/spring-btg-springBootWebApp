package pl.jakubowskiprzemyslaw.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.jakubowskiprzemyslaw.spring5webapp.Author;
import pl.jakubowskiprzemyslaw.spring5webapp.Book;
import pl.jakubowskiprzemyslaw.spring5webapp.Publisher;
import pl.jakubowskiprzemyslaw.spring5webapp.repositories.AuthorRepository;
import pl.jakubowskiprzemyslaw.spring5webapp.repositories.BookRepository;
import pl.jakubowskiprzemyslaw.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        // Eric
        Publisher stefan = new Publisher("Stefan", "Wolica");
        publisherRepository.save(stefan);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain driven development", "1234", stefan);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        // Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", stefan);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}