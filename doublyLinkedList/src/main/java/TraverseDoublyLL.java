public class TraverseDoublyLL {
    static class Node {
        public int data;
        public Node next;
        public Node prev;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public static Node constructDLL(int []arr) {
        int N=arr.length;
        Node head=new Node(arr[0]);
        Node current=head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode=new Node(arr[i]);
            newNode.prev=current;
            current.next=newNode;
            newNode.next=null;
            current=newNode;
        }
        return head;
    }
}
