package Controller;

import Model.Product;
import Service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {
        String action = request.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "them":
                them(request,response);
            case "xoa":
                xoa(request,response);
            case "xem":
                xem(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "hienthi":
                hienthi(request, response);
                break;
            case "them":
                request.getRequestDispatcher("view/them.jsp").forward(request, response);
                break;
            case "xoa":
                request.getRequestDispatcher("view/xoa.jsp").forward(request, response);
                break;
            case "xem":
                request.getRequestDispatcher("view/xem.jsp").forward(request, response);
                break;
        }
    }
    
    private void xem(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.displayByID(id);
        request.setAttribute("product",product);
        try {
            request.getRequestDispatcher("/view/xem.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void xoa(HttpServletRequest request, HttpServletResponse response) {
         int id = Integer.parseInt(request.getParameter("id"));
         productService.deleteById(id);
         hienthi(request,response);
    }

    private void them(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String tenSanPham = request.getParameter("tenSanPham");
        String nhaSanXuat = request.getParameter("nhaSanXuat");
        productService.add(new Product(id,tenSanPham,nhaSanXuat));
        hienthi(request,response);
    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response){
        List<Product> productList =productService.findAll();
        request.setAttribute("productList",productList);
        try {
            request.getRequestDispatcher("view/hienthi.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
