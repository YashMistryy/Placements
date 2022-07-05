package DS_ALGO.Linked_List;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class MergeTwoSortedList {
    // for refrencing our linkedlist we use head
    static  ListNode head;

   private static class ListNode {
         int data;
         ListNode next;

         public ListNode(int data){
             this.data= data;
             this.next= null;
             
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
      
        MergeTwoSortedList sll1 = new MergeTwoSortedList();
        sll1.insertAtEnd(1);
        sll1.insertAtEnd(3);
        sll1.insertAtEnd(5);
        sll1.insertAtEnd(9);
        
        MergeTwoSortedList sll2 = new MergeTwoSortedList();
        sll2.insertAtEnd(2);
        sll2.insertAtEnd(4);
        sll2.insertAtEnd(8);

        
        sll1.display();
        sll2.display();


    }
    private void insertAtEnd(int data) {
        ListNode ptr = head;
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;

        }
        while(ptr.next!=null){
            ptr = ptr.next;
        }        
        // now ptr points to tail of the sll
    
        ptr.next = newNode;
    }   
}
