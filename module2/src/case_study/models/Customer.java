package case_study.models;

public class Customer extends People {
    private String loaiKhach;
    private String diaChi;

    public Customer(String name, String birthday, String gender, int cMND, int phone, String email, int ID, String loaiKhach, String diaChi) {
        super(name, birthday, gender, cMND, phone, email, ID);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer() {
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", ID=" + ID +
                '}';
    }
}
