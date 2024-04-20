public class CountNodeLL {
    class Node {
        public int data;
        public Node next;

        Node()
        {
            this.data = 0;
            this.next = null;
        }

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    public static int length(Node head){
        //Your code goes here
        int size=1;
        if(head==null){
            return 0;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
}
