import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PingServlet", urlPatterns = "/ping")
public class PingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<form method=\"GET\" action=\"/pong\">\n" +
                "<input style= 'font-size: 20px; font-weight: bold; background-color: dodgerblue; width: 100px; height: 100px; border: 2px solid black; border-radius: 50%;' type=\"submit\" value=\"Ping\">" +
                "</form>" +
                "<div style= 'background-color: tan; width: 20px; height: 65px; border: 2px solid black; margin-top: -35; margin-left: 40px; border-radius: 10px'></div>\n");
    }
}
