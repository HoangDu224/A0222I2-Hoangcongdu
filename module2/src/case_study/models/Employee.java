package case_study.models;

public class Employee extends People {
    private String trinhDo;
    private String viTri;
    private String saLaRy;

    public Employee(String name, String birthday, String gender, int cMND, int phone, String email, int ID, String trinhDo, String viTri, String saLaRy) {
        super(name, birthday, gender, cMND, phone, email, ID);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.saLaRy = saLaRy;
    }

    public Employee() {
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getSaLaRy() {
        return saLaRy;
    }

    public void setSaLaRy(String saLaRy) {
        this.saLaRy = saLaRy;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", saLaRy='" + saLaRy + '\'' +
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
