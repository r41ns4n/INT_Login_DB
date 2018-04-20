package de.gbsschulen.bookstore.login;

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
    public void saveLogin(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    } // END public void saveLogin(User user)

    public boolean checkPassword(String name, String password) {

        if (name != null && name.length() == 0) {
            return false;
        } // END IF

        TypedQuery<User> query = entityManager.createQuery("SELECT l FROM User l WHERE l.loginname = :name", User.class);
        query.setParameter("name", name);
        List<User> resultList = query.getResultList();
        for (User user : resultList) {
            System.out.println(user);
            if (user.getLoginname().equals(name) && user.getPassword().equals(password)) {
                System.out.println(user.getLoginname());
                return true;
            } // END IF
        } // END FOR
        return false;
    } // END public boolean checkPassword

} // END CLASS LoginService
