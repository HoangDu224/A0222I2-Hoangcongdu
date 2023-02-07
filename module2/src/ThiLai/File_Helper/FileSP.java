package ThiLai.File_Helper;

import ThiLai.model.NhapKhau;
import ThiLai.model.SanPham;
import ThiLai.model.XuatKhau;
import ThiModule.BenhAn.BenhAn;
import ThiModule.BenhAn.BenhAnThuong;
import ThiModule.BenhAn.BenhAnVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSP {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static List<String> read(String path) {
        List<String> result = new ArrayList<String>();

        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    result.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void write(String path, List<SanPham> productList, boolean isAppend) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for (int i = 0; i < productList.size(); i++) {
                writer.write(productList.get(i).toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileCSV(String path, List<SanPham> productList, boolean isAppend) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for (SanPham sanPham : productList) {
                writer.append(String.valueOf(sanPham.getId()));
                writer.append(COMMA_DELIMITER);
                writer.append(sanPham.getMaSanPham());
                writer.append(COMMA_DELIMITER);
                writer.append(sanPham.getTenSanPham());
                writer.append(COMMA_DELIMITER);
                writer.append(String.valueOf(sanPham.getPrice()));
                writer.append(COMMA_DELIMITER);
                writer.append(String.valueOf(sanPham.getSoLuong()));
                writer.append(COMMA_DELIMITER);
                writer.append(sanPham.getNhaSanXuat());
                writer.append(COMMA_DELIMITER);
                if (sanPham instanceof NhapKhau) {
                    writer.write(String.valueOf(((NhapKhau) sanPham).getPriceNhapKhau()));
                    writer.append(COMMA_DELIMITER);
                    writer.write(((NhapKhau) sanPham).getTinhThanhNhap());
                    writer.append(COMMA_DELIMITER);
                    writer.write(String.valueOf(((NhapKhau) sanPham).getThueNhapKhau()));

                }
                if (sanPham instanceof XuatKhau) {
                    writer.append(String.valueOf(((XuatKhau) sanPham).getPriceXuatKhau()));
                    writer.append(COMMA_DELIMITER);
                    writer.append(((XuatKhau) sanPham).getCountryXuatKhau());
                }
                writer.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SanPham> readFileCSV(String path) {
        List<SanPham> result = new ArrayList<>();
        List<String> line = read(path);
        for (int i = 0; i < line.size(); i++) {
            String[] arrLine = line.get(i).split(",");
            int id = Integer.parseInt(arrLine[0]);
            String maSanPham = arrLine[1];
            String tenSanPham = arrLine[2];
            String price = arrLine[3];
            String soLuong = arrLine[4];
            String nhaSanXuat = arrLine[5];
            if (arrLine.length <= 8) {
                String giaXuatKhau = arrLine[6];
                String countryXuatKhau = arrLine[7];
                XuatKhau xuatKhau = new XuatKhau(id,maSanPham,tenSanPham,Float.parseFloat(price),Float.parseFloat(soLuong),nhaSanXuat,Float.parseFloat(giaXuatKhau),countryXuatKhau);
                result.add(xuatKhau);
            } else {
                String giaNhapKhau = arrLine[6];
                String tinhThanhNhap = arrLine[7];
                String thueNhapKhau = arrLine[8];
                NhapKhau nhapKhau = new NhapKhau(id,maSanPham,tenSanPham,Float.parseFloat(price),Float.parseFloat(soLuong),nhaSanXuat,Float.parseFloat(giaNhapKhau),tinhThanhNhap,Float.parseFloat(thueNhapKhau));
                result.add(nhapKhau);
            }
        }
        return result;
    }

}

