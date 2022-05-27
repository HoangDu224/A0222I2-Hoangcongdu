package ss04LopVaDoiTuongTrongJava.BaiTap.LopFan;

public class Fan {
    public static void main(String[] args) {
        LopFan fan1 = new LopFan(true,10,3,"red");
        System.out.println("Fan1: "+fan1.toString());
        LopFan fan2 = new LopFan(false,5,2,"yellow");
        System.out.println("\nFan2: "+fan2.toString());
    }
}
