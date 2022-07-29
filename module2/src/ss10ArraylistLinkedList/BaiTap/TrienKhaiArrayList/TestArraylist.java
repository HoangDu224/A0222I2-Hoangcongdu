package ss10ArraylistLinkedList.BaiTap.TrienKhaiArrayList;

public class TestArraylist {
    public static void main(String[] args) {
        Arraylist<Integer> arrlist = new Arraylist<>(4);
        arrlist.add(0, 0);
        arrlist.add(1, 1);
        arrlist.add(2, 5);
        arrlist.add(3, 3);
        arrlist.Add(7);
        System.out.println("element 0 :" + arrlist.get(0));
        System.out.println("element 1 :" + arrlist.get(1));
        System.out.println("element 2 :" + arrlist.get(2));
        System.out.println("element 3 :" + arrlist.get(3));
        System.out.println("size: " + arrlist.size());

    }
}
