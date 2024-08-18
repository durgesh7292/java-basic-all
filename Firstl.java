
public class Firstl {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public static void main(String[] args) {
        Firstl ll=new Firstl();
       ll.addFirst(1);
       ll.addFirst(2);
    }
}