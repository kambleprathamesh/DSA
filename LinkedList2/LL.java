public class LL {

    // create class of Node
    public static class Node {
        int data;
        Node next;

        // create constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // create head and tail
    public static Node Head;
    public static Node Tail;

    // addfirst
    public void addFirst(int data) {
        // create newNode
        Node newNode = new Node(data);

        // check if LL is empty
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        // asssign newnode next=head
        newNode.next = Head;

        // update head to newnode
        Head = newNode;

    }

    // addLast
    public void addLast(int data) {
        // create newnode
        Node newNode = new Node(data);

        // check if LL is empty
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        // assign newnode=tail.next
        Tail.next = newNode;
        // tail=newNode
        newNode = Tail;
    }

    // printLL
    public void printLL() {
        Node Temp = Head;
        while (Temp != null) {
            System.out.print(Temp.data + "--->");
            Temp = Temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        Linklist ll = new Linklist();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(18);
        ll.printLL();
    }
}
