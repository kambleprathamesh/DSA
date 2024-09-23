// public class Linklist {

//     // create node classs
//     public static class Node {
//         int data;

//         // 'next' is a reference to the next node in the linked list of class Node
//         // itself
//         Node next;

//         // create constructor
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }

//         // defn head and tail
//         public static Node Head;
//         public static Node Tail;

//         // add firstnode
//         public void addFirst(int data) {
//             // create a new node
//             Node newNode = new Node(data);

//             // check wether the node is empty
//             if (Head == null) {
//                 Head = newNode;
//             }
//             // assign new nodeNext with header
//             newNode.next = Head;
//             // assign header wwith the new node
//             Head = newNode;
//         }
//     }

//     public static void main(String args[]) {

//     }
// }

public class Linklist {

    public static class Node {
        int data;
        Node next;

        // create constructors
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add linklist at the start
    public void addFirst(int data) {
        // create newnode
        Node newNode = new Node(data);
        size++;
        // check wether the head and tail are null
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // assign header valu to newnode
        newNode.next = head;
        // assiign header the newnode value
        head = newNode;
    }

    // add linklist at the end
    public void addLast(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        // check head is null
        if (head == null) {
            head = tail = newNode;
        }

        // add the new node to the tail next
        tail.next = newNode;

        // assign tail with new node
        tail = newNode;
    }

    // add ll in the middle
    public void addMiddle(int idx, int data) {
        // create newNode

        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i != (idx - 1)) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    // print ll
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");

    }

    public static void main(String args[]) {
        Linklist ll = new Linklist();
        // ll.printList();
        ll.addFirst(1);
        ll.printList();

        ll.addFirst(2);
        ll.printList();

        ll.addLast(3);
        ll.printList();

        ll.addLast(4);
        ll.printList();
        ll.addMiddle(2, 10);
        ll.printList();
        System.out.print("Size of the LL is" + size);
    }
}