package Controller;

import Model.Customer;
import Service.ImpCustomer;
import Service.ImpTypeCustomerSerVice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CaseStudyServlet", value = "/furama")
public class CaseStudyServlet extends HttpServlet {
    ImpCustomer impCustomer = new ImpCustomer();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Create":
                CreateCustomer(request, response);
                break;
        }
    }

    private void CreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int type = Integer.parseInt(request.getParameter("type"));
        String birthday = request.getParameter("birthday");
        Boolean gender = (request.getParameter("gender")).equals("0");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        impCustomer.Add(new Customer(type, name, birthday, gender, idCard, phone, email, address));
        hienthi(request, response, null);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Customer":
                hienthi(request, response, null);
                break;
            case "Create":
                ShowCreateCustomerForm(request, response);
                break;
            case "Delete":
                Delete(request, response);
                break;
            case "Update":
                edit(request, response);
                break;
            case "Search":
                search(request,response);
                break;
            default:
                response.sendRedirect("index.jsp");
                break;
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");
        String searchPhone = request.getParameter("searchPhone");
        String searchDiachi = request.getParameter("searchAddress");

        List<Customer> customerList = impCustomer.Search(searchName,searchPhone,searchDiachi);
        request.setAttribute("customerList",customerList);

        try {
            request.getRequestDispatcher("view/Customer/Customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ShowCreateCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        ImpTypeCustomerSerVice typeCustomerSerVice = new ImpTypeCustomerSerVice();
        request.setAttribute("listType", typeCustomerSerVice.findAll());
        try {
            request.getRequestDispatcher("view/Customer/CreateCustomerForm.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("EditId"));
        int type = Integer.parseInt(request.getParameter("EditType"));
        String name = request.getParameter("EditName");
        String birthday = request.getParameter("EditBirthday");
        Boolean gender = request.getParameter("EditGender").equals("true");
        String idCard = request.getParameter("EditIdCard");
        String phone = request.getParameter("EditPhone");
        String email = request.getParameter("EditAddress");
        String address = request.getParameter("EditAddress");
        impCustomer.Edit(new Customer(id, type, name, birthday, gender, idCard, phone, email, address));
        hienthi(request, response, null);

    }

    private void Delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        impCustomer.Delete(id);
        hienthi(request, response, null);
    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response, List<Customer> customerList) {
        if (customerList == null) {
            customerList = impCustomer.findAll();
        }
        request.setAttribute("customerList", customerList);
        ImpTypeCustomerSerVice typeCustomerSerVice = new ImpTypeCustomerSerVice();
        request.setAttribute("listType", typeCustomerSerVice.findAll());
        try {
            request.getRequestDispatcher("view/Customer/Customer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
