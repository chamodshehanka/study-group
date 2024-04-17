public class CircularLinkedList {
    Node head;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;

            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
        } else {
            Node current = head;

            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);

        cll.display();
    }
}
