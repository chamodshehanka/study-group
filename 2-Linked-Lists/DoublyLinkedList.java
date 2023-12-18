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
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
}
