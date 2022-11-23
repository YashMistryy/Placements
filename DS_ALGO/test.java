import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        test list = new test();
        // reverse a linked list
        ListNode head = new ListNode(12);
        ListNode node2 = new ListNode(24);
        ListNode node3 = new ListNode(36);
        ListNode node4 = new ListNode(48);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        display(head);
        head = reverseSLL(head);
        display(head);
        
      
    }

    private static ListNode reverseSLL(ListNode head) {
        // ListNode prv= null;
        // ListNode ptr = head;
        // ListNode next = null;
        // while(ptr!=null){
        //    next = ptr.next;
        //    ptr.next = prv;
        //    prv = ptr;
        //    ptr = next;
        // }
        // head = prv;
        ListNode ptr = head;
        ListNode prvs = null;
        ListNode next = null;

        while(ptr!=null){
            next = ptr.next;
            ptr.next = prvs;
            prvs = ptr;
            ptr = next;
        }
        return prvs;

    }

    public static void display(ListNode head){
        ListNode ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        } System.out.println("null");

    }
    
}
 class ListNode {
    int data;
    ListNode next;

    public ListNode(int data){
        this.data= data;
        this.next= null;
    }

}