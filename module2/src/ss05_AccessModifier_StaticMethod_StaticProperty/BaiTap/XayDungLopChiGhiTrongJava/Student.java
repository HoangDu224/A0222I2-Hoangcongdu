package ss05_AccessModifier_StaticMethod_StaticProperty.BaiTap.XayDungLopChiGhiTrongJava;

public class Student {
    public static void main(String[] args) {
        LopStudent john = new LopStudent("john","3");
        john.setName("Hon");
        john.setClassis("10");
        System.out.println(john.getInfo());
    }
}
