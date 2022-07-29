package File_Helper;

import ThiModule.BenhAn.BenhAn;
import ThiModule.BenhAn.BenhAnThuong;
import ThiModule.BenhAn.BenhAnVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "stt,Ma benh an ,Ma benh nhan , name ,date nhap vien , date ra vien , ly do";

    public List<String> read(String path) {
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

    public void write(String path, List<BenhAn> benhAnList, boolean isAppend) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for (int i = 0; i < benhAnList.size(); i++) {
                writer.write(benhAnList.get(i).toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileCSV(String path, List<BenhAn> benhAnList, boolean isAppend) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for (BenhAn benhAn : benhAnList) {
                writer.append(String.valueOf(benhAn.getStt()));
                writer.append(COMMA_DELIMITER);
                writer.append(benhAn.getMaBenhAn());
                writer.append(COMMA_DELIMITER);
                writer.append(benhAn.getMaBenhNhan());
                writer.append(COMMA_DELIMITER);
                writer.append(benhAn.getName());
                writer.append(COMMA_DELIMITER);
                writer.append(benhAn.getDateNhapVien());
                writer.append(COMMA_DELIMITER);
                writer.append(benhAn.getDateRaVien());
                writer.append(COMMA_DELIMITER);
                writer.append(benhAn.getLyDo());
                writer.append(COMMA_DELIMITER);
                if (benhAn instanceof BenhAnThuong) {
                    writer.write(String.valueOf(((BenhAnThuong) benhAn).getPrice()));
                }
                if (benhAn instanceof BenhAnVip) {
                    writer.append(((BenhAnVip) benhAn).getVip());
                    writer.append(COMMA_DELIMITER);
                    writer.append(((BenhAnVip) benhAn).getThoiHanVip());
                }
                writer.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BenhAn> readFileCSV(String path) {
        List<BenhAn> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                String[] arrLine = reader.readLine().split(",");
                int stt = Integer.parseInt(arrLine[0]);
                String maBenhAn = arrLine[1];
                String maBenhNhan = arrLine[2];
                String name = arrLine[3];
                String dateNhapVien = arrLine[4];
                String dataRaVien = arrLine[5];
                String lydo = arrLine[6];
                if (arrLine.length <= 7) {
                    int price = Integer.parseInt(arrLine[7]);
                    BenhAnThuong benhAnThuong = new BenhAnThuong(stt, maBenhAn, maBenhNhan, name, dateNhapVien, dataRaVien, lydo, price);
                    result.add(benhAnThuong);
                } else {
                    String vip = arrLine[7];
                    String thoiHanVip = arrLine[8];
                    BenhAnVip benhAnVip = new BenhAnVip(stt, maBenhAn, maBenhNhan, name, dateNhapVien, dataRaVien, lydo, vip, thoiHanVip);
                    result.add(benhAnVip);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
