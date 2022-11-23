package Linked_List;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class SinglyLinkedList {
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
    public static void display(ListNode head){
        ListNode ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        } System.out.println("null");

    }

    public static void main(String[] args) {
        // creating a sll
        SinglyLinkedList mySll = new SinglyLinkedList();
        // creating or adding data to our list's head node
        mySll.head = new ListNode(23);
        // creating some other nodes
        ListNode second = new ListNode(34);
        ListNode third = new ListNode(45);
        ListNode fourth = new ListNode(56);
        // now linking these nodes one after one to form a list
        mySll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        // now all nodes are linked we will print it using another pointer
    //    ListNode ptr = head;
    //    while(ptr!=null){
    //        System.out.print("->");
    //        System.out.print(ptr.data);
    //        ptr = ptr.next;
    //    }   
        // mySll.InsertRec(head, 69, 4-1);

        display(head);


    }
    static void InsertRec(int val , int index){
        InsertRec(head, val, index);
    }
    static ListNode InsertRec(ListNode node , int val , int index){
        ListNode ptr = node;//this will be head in first call
      
        if(index == 0){
            ListNode nodex = new ListNode(val);
            nodex.next = ptr.next;
            ptr.next = nodex;
            return ptr;
        }
        head = InsertRec(ptr.next, val, index-1);
        return head;
    }
}
