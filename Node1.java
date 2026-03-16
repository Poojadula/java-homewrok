class Node1 {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList1 {
    Node head;

    // Insert at beginning
    void insertBeginning(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at middle (specific position)
    void insertMiddle(String data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert at end
    void insertEnd(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertBeginning("Ravi");
        list.insertBeginning("Kumar");
        list.insertBeginning("Arun");

        list.insertMiddle("Vijay", 3);

        list.insertEnd("Ajay");

        list.display();
    }
}