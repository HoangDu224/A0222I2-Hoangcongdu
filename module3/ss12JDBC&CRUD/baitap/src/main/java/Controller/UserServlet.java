package Controller;

import Model.User;
import Repository.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "them":
                them(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "hienthi":
                hienthi(request, response, null);
                break;
            case "them":
                response.sendRedirect("View/them.jsp");
                break;
            case "xoa":
                xoa(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "sapxep":
                hienthi(request,response,sapxep());
                break;
            case "searchByCountry":
                hienthi(request,response,searchByCountry(request,response));
                break;
        }
    }

    private List<User> searchByCountry(HttpServletRequest request, HttpServletResponse response) {
        String country = request.getParameter("country");
        return userDAO.searchByCountry(country);
    }


    private List<User> sapxep() {
        return userDAO.sortUserByName();
    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response, List<User> userList) {
        if (userList == null) {
            userList = userDAO.selectAllUsers();
        }
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("View/hienthi.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void them(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        try {
            userDAO.insertUser(new User(name, email, country));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        hienthi(request, response,null);
    }

    private void xoa(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        userDAO.deleteUser(id);
        hienthi(request, response,null);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("EditId"));
        String newName = request.getParameter("EditName");
        String newEmail = request.getParameter("EditEmail");
        String newCountry = request.getParameter("EditCountry");

        User user = new User(id, newName, newEmail, newCountry);
        userDAO.updateUser(user);
        hienthi(request, response,null);
    }


}
