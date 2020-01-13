import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProfileServlet", urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == "false") {
            response.sendRedirect("/login");
            return;
        } else if (request.getSession().getAttribute("user") == "true") {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }else {
            response.sendRedirect("/login");
        }

    }
}
