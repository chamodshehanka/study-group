class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    public Node2(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DoublyLinkedList {
    Node2 head;
    Node2 tail;

    public void insert(int data){
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    public void displayForward() {
        Node2 current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node2 current = tail;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);
        dll.insert(5);
        dll.displayForward();
        dll.displayBackward();
    }
}
