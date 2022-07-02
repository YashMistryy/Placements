package DS_ALGO.Linked_List;

import java.beans.IndexedPropertyChangeEvent;
import java.rmi.server.LogStream;

public class InsertNodeList{
    static ListNode head = null;
    static class ListNode{
        int data;
        ListNode next;
         
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
 
     }
     public static void display(){
         ListNode ptr = head;
         while(ptr!=null){
             System.out.print(ptr.data+"->");
             ptr = ptr.next;
         } System.out.println("null");
 
     }
 
     public static void main(String[] args) {
         InsertNodeList sll = new InsertNodeList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         
        head.next = second;
        second.next = third;
        
        sll.insertAtAny(232,2);
         display();
        
     }



    private void insertAtBegin(int data) {
        ListNode newHead = new ListNode(data);
        newHead.next = head;
        head = newHead;
    }

    private void insertAtEnd(int data) {
        ListNode ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }        
        // now ptr points to tail of the sll
        ListNode newNode = new ListNode(data);
        ptr.next = newNode;
    }

    private void insertAtAny(int data , int index) {
        ListNode newnNode = new ListNode(data);
        ListNode ptr = head;
        ListNode prvs=null;
        if(index == 0){
            newnNode.next = head;
            head = newnNode;
        }
        else{
            while(index>0){
                prvs = ptr;
                ptr = ptr.next;
                index--;
            }
            // System.out.println(ptr.data);
            // System.out.println(prvs.data);
            newnNode.next = ptr;
            prvs.next= newnNode;


        }
    }   
}