public class SearchInLL {
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
    public static int searchInLinkedList(Node head, int k)
    {
        if(head==null){
            return 0;
        }
        if(head.data==k){
            return 1;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            if(temp.data==k){
                return 1;
            }



        }


        return 0;
    }
}
