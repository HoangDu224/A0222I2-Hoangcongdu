package ss17BinaryFileAndSerialization.ThucHanh.DocVaGhiDanhSachSinhVienRaFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("src\\ss17BinaryFileAndSerialization\\ThucHanh\\DocVaGhiDanhSachSinhVienRaFileNhiPhan\\students.txt",students);
        List<Student> studentList = new ArrayList<>();
        studentList = readDataFromFile("src\\ss17BinaryFileAndSerialization\\ThucHanh\\DocVaGhiDanhSachSinhVienRaFileNhiPhan\\students.txt");
        System.out.println(studentList.toString());
    }
    public static void writeToFile(String filePath, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String filePath){
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return studentList;
    }
}
