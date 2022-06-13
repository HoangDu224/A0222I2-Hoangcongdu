package ss09.ThucHanh.TrienKhaiLopLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printList();
    }
}
