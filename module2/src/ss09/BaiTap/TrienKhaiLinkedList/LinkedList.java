package ss09.BaiTap.TrienKhaiLinkedList;

import ss09.ThucHanh.TrienKhaiLopLinkedList.MyLinkedList;

public class LinkedList<E> {
    public Node head;
    public int numNodes;
    public LinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index,E element){
        Node temp = head;
        Node holder ;
        for (int i = 0 ;i<index-1 && temp.next!=null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data){
        Node temp = head;
        for (int i = 0 ; i<numNodes;i++){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }
    public E remove(int index){
        Node current = head;
        Node temp= null;
        for (int i = 0 ; i<index;i++){
            temp = current;
            current = current.next;
        }
        temp.next = current.next;
        numNodes--;
        return (E) current;
    }
    public boolean Remove(Object data){
        Node current = head ;
        int count = 0 ;
        for (int i= 0 ;i<numNodes;i++){
            current = current.next;
            count++;
            }
        if (current.data==data){
            remove(count);
            return true;
        }
        return false;
    }
    public E get(int i ){
        Node current = head ;
        for (int j = 0 ; j<i;j++){
            current = current.next;
        }
        E current1 = (E) current.getData();
        return current1;
    }
    public int size(){
        return numNodes;
    }
    public boolean contains(E data){
        Node current = head ;
        for (int i= 0 ;i<numNodes;i++){
            current = current.next;
        }
        if (current.data==data){
            return true;
        }
        return false;

    }
    public int indexOf(E data){
        Node current = head ;
        int count = 0 ;
        for (int i= 0 ;i<numNodes;i++){
            current = current.next;
            count++;
        }
        if (current.data==data){
            return count;
        }
        return -1;

    }
//    public LinkedList clone() throws CloneNotSupportedException {
//        LinkedList cloned = (LinkedList) super.clone();
//        Node temp = head;
//        Node temp1 = temp.Clone();
//        cloned.head = temp1;
//        while(temp.next != null) {
//            temp1.next =  temp.next.Clone();
//            temp = temp.next;
//            temp1 = temp1.next;
//        }
//        return cloned;
//    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public class Node{
        Node next;
        Object data;
        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
