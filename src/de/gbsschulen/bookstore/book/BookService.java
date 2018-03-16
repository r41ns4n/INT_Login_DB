package de.gbsschulen.bookstore.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookService {

    // DATA FIELDS
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    // CONSTRUCTOR
    public BookService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
        entityManager = entityManagerFactory.createEntityManager();
    } // END CONSTRUCTOR

    // METHODS
    public void save(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
    } // END public void save

} // END CLASS BookService
