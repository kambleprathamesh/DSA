public class Linklist {

    public static class Node {
        int data;
        Node next;

        // constructors
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail
    public static Node Head;
    public static Node Tail;

    // methods
    // add,remove

    public void addFirst(int data) {
        // create New Node
        Node newNode = new Node(data);
        // check if the LL is empty if empty then do as follow
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        // newnode next=head
        newNode.next = Head;
        // update the head with new node
        Head = newNode;
    }

    // add laast
    public void addLast(int data) {
        // create New Node
        Node newNode = new Node(data);
        // check if the LL is empty if empty then do as follow
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // update the tail next
        Tail.next = newNode;

        // update the TAil with new node
        Tail = newNode;
    }

    // print ll
    public void printLL() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        Linklist ll = new Linklist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(6);
        ll.addLast(8);
        ll.printLL();
    }
}