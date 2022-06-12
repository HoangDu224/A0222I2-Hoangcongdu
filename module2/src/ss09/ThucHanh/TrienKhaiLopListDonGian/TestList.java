package ss09.ThucHanh.TrienKhaiLopListDonGian;

public class TestList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>(10);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element 4: "+listInteger.get(0));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 2: "+listInteger.get(8));
    }
}
