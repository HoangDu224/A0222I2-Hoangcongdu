import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "KhachhangServlet" , value = "/khachhang")
public class KhachhangServlet extends HttpServlet {
    static List<Khachhang> khachhangList = new ArrayList<>();
    static {
        khachhangList.add(new Khachhang("Mai van Hoan","11-11-1111","Ha noi","src\\img.png"));
        khachhangList.add(new Khachhang("Mai van hon","11-11-1111","Ha noi","src\\img.png"));
        khachhangList.add(new Khachhang("Mai van hai","11-11-1111","Ha noi","src\\img.png"));
        khachhangList.add(new Khachhang("Mai van a","11-11-1111","Ha noi","src\\img.png"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("khachhangList",khachhangList);
        request.getRequestDispatcher("View\\list.jsp").forward(request,response);
    }
}
