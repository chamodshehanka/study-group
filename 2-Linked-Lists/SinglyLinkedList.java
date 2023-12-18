class Node {
    Node next;
    int data;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insert(10);
        singlyLinkedList.insert(20);
        singlyLinkedList.insert(30);

        singlyLinkedList.display();

        singlyLinkedList.insert(40);

        singlyLinkedList.display();
    }
}

