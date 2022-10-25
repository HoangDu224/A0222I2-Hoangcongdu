import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    static Calculator calculator = new Calculator();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int firstOperator = Integer.parseInt(request.getParameter("firstOperator"));
        int secondOperator = Integer.parseInt(request.getParameter("secondOperator"));
        String operator = request.getParameter("operator");
        boolean check = true;
        float result = 0;
        String message = null;
        try {
            result = calculator.calculate(firstOperator, secondOperator, operator);
        } catch (ArithmeticException e) {
            message = "Khong the chia cho 0";
            check = false;
        }
        if (check) {
            request.setAttribute("result", result);
        } else {
            request.setAttribute("result", message);
        }
        request.setAttribute("firstOperator", firstOperator);
        request.setAttribute("secondOperator", secondOperator);
        request.getRequestDispatcher("view\\result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
