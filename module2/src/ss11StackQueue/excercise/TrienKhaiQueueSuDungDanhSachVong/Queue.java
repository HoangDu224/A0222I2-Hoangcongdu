package ss11StackQueue.excercise.TrienKhaiQueueSuDungDanhSachVong;

public class Queue {
    Node front;
    Node rear;

    public void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = rear = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    public int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = q.rear = null;
        } else {
            value = q.front.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    class Node {
        int data;
        Node link;
    }
}
