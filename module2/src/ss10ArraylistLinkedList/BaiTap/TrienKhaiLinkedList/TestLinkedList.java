package ss10ArraylistLinkedList.BaiTap.TrienKhaiLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        System.out.println(ll.contains(10));
        ll.printList();
    }
}
