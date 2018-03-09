package de.gbsschulen.bookstore.login;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    // Data Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String loginname;
    private String password;

    // CONSTRUCTOR
    public User(){
    }

    public User(String loginname, String password) {
        this.loginname = loginname;
        this.password = password;
    }

    // METHODS
    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(loginname, user.loginname) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(loginname, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

} // END CLASS User

