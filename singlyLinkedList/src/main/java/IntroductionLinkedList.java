public class IntroductionLinkedList {
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

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
            this.prev = next;
        }
    }
    public static Node constructLL(int []arr) {
        if(arr==null||arr.length==0){
            return null;
        }
        Node head =new Node(arr[0]);
        Node current=head;
        for(int i=1;i<arr.length;i++){
            Node newNode= new Node(arr[i]);
            current.next=newNode;
            current=newNode;
        }
        return head;
    }
}
