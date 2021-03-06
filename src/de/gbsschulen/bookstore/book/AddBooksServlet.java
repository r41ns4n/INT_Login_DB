package de.gbsschulen.bookstore.book;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addBooks.do")
public class AddBooksServlet extends HttpServlet {

   private BookService bookService = new BookService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/addBook.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book();
        book.setAutor(req.getParameter("autor"));
        book.setISBN(req.getParameter("ISBN"));
        book.setTitle(req.getParameter("title"));
        bookService.save(book);
        resp.sendRedirect("listBooks.do");
    }
}
