package Controller;

import Model.PhongTro;
import Repository.PhongRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ThiServlet", value = {"/thi"})
public class ThiServlet extends HttpServlet {
    PhongRepository phongRepository = new PhongRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Add":
                Add(request, response);
                break;
            default:
                hienthi(request, response);
                break;
        }
    }

    private void Add(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("tenNguoi");
        int phone = Integer.parseInt(request.getParameter("soDienThoai"));
//        String[] checkPhone = request.getParameter("soDienThoai").split("");
//        if (checkPhone.length>10){
//            String message = "So dien thoai phai it hon 10 so";
//            request.setAttribute("message",message);
//            request.getRequestDispatcher("view/them.jsp");
//        }
        String date = request.getParameter("ngayBatDau");
        String hinhthuc = request.getParameter("hinhThuc");
        String ghichu = request.getParameter("ghiChu");
        if (ghichu == null){
            ghichu = "";
        }
        phongRepository.Add(new PhongTro(name,phone,date,hinhthuc,ghichu));
        hienthi(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "PhongTro":
                hienthi(request, response);
                break;
            case "Search":
                search(request, response);
                break;
            case "Add":
                request.getRequestDispatcher("view/them.jsp").forward(request,response);
                break;
            case "Delete":
                Delete(request,response);
            default:
                hienthi(request, response);
                break;
        }
    }

    private void Delete(HttpServletRequest request, HttpServletResponse response) {
        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
        phongRepository.Delete(deleteId);
        hienthi(request,response);
    }


    private void hienthi(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("phongtroList", phongRepository.findAll());
        try {
            request.getRequestDispatcher("view/hienthi.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");
        String searchPhone = request.getParameter("searchPhone");
        String searchMa = request.getParameter("searchMa");

        List<PhongTro> phongTroList = phongRepository.Search(searchName, searchPhone, searchMa);
        request.setAttribute("phongtroList", phongTroList);

        try {
            request.getRequestDispatcher("view/hienthi.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
