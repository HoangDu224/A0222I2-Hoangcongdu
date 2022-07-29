package ss11StackQueue.excercise.TrienKhaiQueueSuDungDanhSachVong;

public class TestQueue {
    public static void main(String[] args) {
        Queue test = new Queue();
        test.enQueue(test, 1);
        test.enQueue(test, 2);
        test.enQueue(test, 3);
        System.out.println(test.deQueue(test));
        test.enQueue(test, 4);
        System.out.println(test.deQueue(test));
        System.out.println(test.deQueue(test));
        System.out.println(test.deQueue(test));
    }
}
