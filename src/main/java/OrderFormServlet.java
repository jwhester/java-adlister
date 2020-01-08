import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OrderFormServlet", urlPatterns = "/order-form")
public class OrderFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<form method=\"POST\" action=\"/order-summary\">\n" +
                "<label for=\"product\">Product:</label>\n" +
                "<input id=\"product\" name=\"product\" placeholder=\"\" />\n" +
                "<label for=\"quantity\">Quantity:</label>\n" +
                "<input id=\"quantity\" name=\"quantity\" placeholder=\"\" />\n" +
                "<input type=\"submit\" value=\"Submit\">" +
                "</form>");
    }
}
