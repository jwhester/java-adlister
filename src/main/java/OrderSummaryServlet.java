import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OrderSummaryServlet", urlPatterns = "/order-summary")
public class OrderSummaryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String product = req.getParameter("product");
        String quantity = req.getParameter("quantity");
        PrintWriter out = res.getWriter();
        out.println(product + "<br>" + quantity);

    }
}
