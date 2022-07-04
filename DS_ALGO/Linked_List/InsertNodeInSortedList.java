package DS_ALGO.Linked_List;

import java.util.List;

public class InsertNodeInSortedList{
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
         InsertNodeInSortedList sll = new InsertNodeInSortedList();
         sll.head = new ListNode(34);
         ListNode second = new ListNode(56);
         ListNode third = new ListNode( 89);
         
        head.next = second;
        second.next = third;
        
        sll.insertInSortedList(44);
         display();
        
     }



    private void insertInSortedList(int data) {
       ListNode newNode = new ListNode(data);
       ListNode ptr = head;
       ListNode prvs = null;

       while(ptr!=null && ptr.data < data){
           prvs = ptr;
           ptr = ptr.next;
       }
       newNode.next = ptr;
       prvs.next = newNode;
    }

   
}