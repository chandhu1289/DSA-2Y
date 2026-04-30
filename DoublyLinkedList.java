class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;
    public void insertAtEnd(int i){
        Node newNode=new Node(data);
        
        if(head ==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    static void main(String[] args){
        DoublyLinkedList dll =new DoublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd();
    }
}