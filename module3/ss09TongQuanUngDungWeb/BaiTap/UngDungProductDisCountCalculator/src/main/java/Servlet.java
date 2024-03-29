import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/display")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        String description = request.getParameter("description");
        float discountAmount = (float) ((price*discount/100)*0.01);
        float afterdiscount = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>description: " + description + "</h1>");
        writer.println("<h1>price: " + price + "</h1>");
        writer.println("<h1>discount: " + discount+"%" + "</h1>");
        writer.println("<h1>discountAmount: " + discountAmount + "</h1>");
        writer.println("<h1>afterdiscount: " + afterdiscount + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
