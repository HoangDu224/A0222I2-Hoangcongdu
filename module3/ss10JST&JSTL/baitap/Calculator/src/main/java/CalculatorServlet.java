import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    static Calculator calculator = new Calculator();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperator = Float.parseFloat(request.getParameter("firstOperator"));
        float secondOperator = Float.parseFloat(request.getParameter("secondOperator"));
        String operator = request.getParameter("operator");
        float result = calculator.calculate(firstOperator,secondOperator,operator);
        request.setAttribute("result",result);
        request.getRequestDispatcher("view\\result.jsp").forward(request,response);
        request.setAttribute("firstOperator",firstOperator);
        request.getRequestDispatcher("view\\result.jsp").forward(request,response);
        request.setAttribute("secondOperator",secondOperator);
        request.getRequestDispatcher("view\\result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
