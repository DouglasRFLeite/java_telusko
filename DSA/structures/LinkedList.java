package structures;

public class LinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    };

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.show(); // Lista vazia

        list.insert(3);
        list.insert(4);
        list.insert(6);

        list.show(); // 3 -> 4 -> 6 -> NULL

        list.insertAt(5, 2);

        list.show(); // 3 -> 4 -> 5 -> 6 -> NULL

        list.insertStart(2);
        list.insertStart(1);

        list.show(); // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL

        list.deleteAt(2);

        list.show(); // 1 -> 2 -> 4 -> 5 -> 6 -> NULL

    }

    public void show() {
        if (head == null) {
            System.out.println("Lista vazia");
            return;
        }

        Node cur = head;
        do {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        } while (cur != null);
        System.out.println("NULL");
    }

    // insere no final
    public void insert(int data) {
        Node newNode = new Node(data, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
    }

    public void insertAt(int data, int index) {
        Node newNode = new Node(data, null);
        int counter = 0;

        if (head == null) {
            head = newNode;
            return;
        }

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node cur = head;
        while (counter != (index - 1) && cur.next != null) {
            cur = cur.next;
            counter++;
        }
        newNode.next = cur.next;
        cur.next = newNode;
    }

    public void insertStart(int data) {
        Node newNode = new Node(data, head);
        head = newNode;
    }

    public void deleteAt(int index) {
        if (head == null) {
            return;
        }

        Node cur = head;
        int counter = 0;
        while (counter < (index - 1) && cur.next != null) {
            counter++;
            cur = cur.next;
        }

        if (counter < (index - 1)) {
            return;
        }

        cur.next = cur.next.next;
    }
}
