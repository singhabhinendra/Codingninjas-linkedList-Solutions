public class DeleteNodeLL {
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
    public static Node deleteLast(Node list){
        if(list==null||list.next==null){
            return null;
        }
        Node head= list;
        Node temp=head;
        Node ptr=temp.next;
        while(ptr.next!=null){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=null;
        return list;
    }
}
