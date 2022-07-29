package ss05_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        LopStudent.change(); //calling change method

        //creating objects
        LopStudent s1 = new LopStudent(111, "Hoang");
        LopStudent s2 = new LopStudent(222, "Khanh");
        LopStudent s3 = new LopStudent(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
