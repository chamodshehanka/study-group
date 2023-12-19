public class QueueUsingLinkedList {
    private Node first, last;

    public QueueUsingLinkedList() {
        first = null;
        last = null;
    }

    public void enqueue(int data) {
        Node oldLast = last;
        last = new Node(data);
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public int dequeue() {
        int data = first.data;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
