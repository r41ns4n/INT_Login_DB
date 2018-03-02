package de.gbsschulen.bookstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class LoginService {

    // DATA FIELDS
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    // CONSTRUCTOR
    public LoginService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
        entityManager = entityManagerFactory.createEntityManager();
    } // END public LoginService()

    // METHODS
    public void saveLogin(Login login) {
        entityManager.getTransaction().begin();
        entityManager.persist(login);
        entityManager.getTransaction().commit();
    } // END public void saveLogin(Login login)

    public boolean checkPassword(String name, String password) {

        if (name != null && name.length() == 0) {
            return false;
        } // END IF

        TypedQuery<Login> query = entityManager.createQuery("SELECT l FROM Login l WHERE l.loginname = :name", Login.class);
        query.setParameter("name", name);
        List<Login> resultList = query.getResultList();
        for (Login login : resultList) {
            if (login.getLoginname().equals(name) && login.getPassword().equals(password)) {
                return true;
            } // END IF
        } // END FOR
        return false;
    } // END public boolean checkPassword

} // END CLASS LoginService
