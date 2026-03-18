class CircularLinkedList {

    // Node structure
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // maintain circular link
        }
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circular link
        }
    }

    // Delete from Beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head; // maintain circular link
        }
    }

    // Delete from End
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    // Display Circular List
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Insert operations
        cll.insertAtBeginning(20);
        cll.insertAtBeginning(10);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);

        // Display
        System.out.println("Circular Linked List:");
        cll.display();

        // Delete from beginning
        cll.deleteFromBeginning();
        System.out.println("After Deleting from Beginning:");
        cll.display();

        // Delete from end
        cll.deleteFromEnd();
        System.out.println("After Deleting from End:");
        cll.display();
    }
}