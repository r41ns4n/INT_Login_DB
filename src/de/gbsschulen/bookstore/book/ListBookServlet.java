package de.gbsschulen.bookstore.book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet(urlPatterns = "/listBooks.do")
public class ListBookServlet extends HttpServlet {

    // DATA FIELDS
    private BookService bookService = new BookService();

    // METHODS
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = bookService.readAllBooks();
        req.getSession().setAttribute("books", bookService.readAllBooks());
        req.getRequestDispatcher("/WEB-INF/views/listBooks.jsp").forward(req,resp);
    }
}

