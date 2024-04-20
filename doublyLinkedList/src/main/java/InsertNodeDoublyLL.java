public class InsertNodeDoublyLL {
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
    public static Node insertAtTail(Node list, int K) {
        Node newNode=new Node(K);
        if(list==null){
            return newNode;
        }
        Node temp=list;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;
        temp=newNode;

        return list;
    }
}
