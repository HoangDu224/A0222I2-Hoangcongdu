package Controller;

import model.HocSinh;
import model.Sach;
import model.TheMuonSach;
import repository.HocSinhRepository;
import repository.TheMuonSachRepository;
import service.SachService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Controller.thiServlet", value = "/thi")
public class thiServlet extends HttpServlet {
    SachService sachService = new SachService();
    HocSinhRepository hocSinhRepository = new HocSinhRepository();
    TheMuonSachRepository theMuonSachRepository = new TheMuonSachRepository();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Muon":
                muonSach(request,response);
                break;
            default:
                hienthi(request,response);
                break;
        }

    }

    private void muonSach(HttpServletRequest request, HttpServletResponse response) {
        String maMuonSach = request.getParameter("maMuon");
        int maSach = Integer.parseInt(request.getParameter("tenSach"));
        int maHocSinh = Integer.parseInt(request.getParameter("hocsinh"));
        String ngayMuon = request.getParameter("ngayMuon");
        String ngayTra = request.getParameter("ngayTra");
        theMuonSachRepository.insertThe(new TheMuonSach(maMuonSach,maSach,maHocSinh,ngayMuon,ngayTra));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "Sach":
                hienthi(request, response);
                break;
            case "Muon":
                showFormMuon(request,response);
                break;
        }
    }

    private void showFormMuon(HttpServletRequest request, HttpServletResponse response) {
        String tenSach = request.getParameter("tenSach");
        request.setAttribute("tenSach",tenSach);
        List<HocSinh> hocSinhList = hocSinhRepository.findAll();
        request.setAttribute("hocsinhList",hocSinhList);
        List<Sach> sachList = sachService.findAll();
        request.setAttribute("sachList", sachList);
        try {
            request.getRequestDispatcher("view/muon.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void hienthi(HttpServletRequest request, HttpServletResponse response) {
        List<Sach> sachList = sachService.findAll();
        request.setAttribute("sachList", sachList);
        try {
            request.getRequestDispatcher("view/sach.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
