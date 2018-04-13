package de.gbsschulen.bookstore.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

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

    //Abfragesprache für JPA heißt "JPQL"
    public List<Book> readAllBooks() {
        TypedQuery<Book> query = entityManager.createQuery("select b from Book b", Book.class);
        return query.getResultList();
    }

    public List<Book> readBooksFromAuthor(String autor) {
        TypedQuery<Book> query = entityManager.createQuery("select b from Book b where b.autor= :autor", Book.class);
        query.setParameter("autor", autor);
        return query.getResultList();
    }

    public List<String> readAllAuthors() {
        TypedQuery<String> query = entityManager.createQuery("select DISTINCT b.autor from Book b", String.class);
        return query.getResultList();
    }

    public Book findBook(int id) {
        return entityManager.find(Book.class, id);
    }

    public void deleteBook(int id) {
        entityManager.getTransaction().begin();
        entityManager.remove(findBook(id));
        entityManager.getTransaction().commit();
    }

    public void close() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }


    // MAIN METHODE FOR INSERT BOOKS
    public static void main(String[] args) {

        // Book book1 = new Book("234", "Effective Java", "Joshua Block");
        // Book book2 = new Book("453", "Java für Anfänger", "Andreas Meier");
        // Book book3 = new Book("999", "Phyton", "Hans Wurst");
        BookService BookService = new BookService();
        // BookService.save(book1);
        // BookService.save(book2);
        // BookService.save(book3);
        List<Book> books = BookService.readAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }

        List<Book> booksFromAuthor = BookService.readBooksFromAuthor("Andreas Meier");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Alle Authoren ausgeben:");
        List<String> allAuthors = BookService.readAllAuthors();
        for (String allAuthor : allAuthors) {
            System.out.println(allAuthor);
        }

        BookService.close();
    }


} // END CLASS BookService
