package ss05_AccessModifier_StaticMethod_StaticProperty.BaiTap.XayDungLopChiGhiTrongJava;

public class LopStudent {
    private String name, classis;

    public LopStudent() {
    }

    public LopStudent(String name, String classis) {
        this.name = name;
        this.classis = classis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassis(String classis) {
        this.classis = classis;
    }

    public String getInfo() {
        return "Name: " + this.name + "\nLop: " + this.classis;
    }
}
