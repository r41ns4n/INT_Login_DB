package de.gbsschulen.bookstore.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    // Data Field
    private LoginService loginService = new LoginService();

    // Methods

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    } // END OVERRIDE doGet

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        if (loginService.checkPassword(name, password)) {
            req.setAttribute("name", name);
            // Nur als Testzweck
            // loginService.saveLogin(new User(name,password));
            req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
        } else {
            req.setAttribute("errorMessage", "LoginServlet nicht erfolgreich");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        } // END IF
    } // END OVERRIDE doPost

} // END CLASS LoginServlet
