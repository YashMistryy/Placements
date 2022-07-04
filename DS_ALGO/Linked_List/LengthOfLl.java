package DS_ALGO.Linked_List;


public class LengthOfLl {
   static class ListNode{
       int data;
       ListNode next;
        
       public ListNode(int data){
           this.data = data;
           this.next = null;
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

        ListNode head = new ListNode(69);
        ListNode second = new ListNode(23);
        ListNode third = new ListNode(46);
        ListNode fourth = new ListNode(0);

        // now linking nodes together
        head.next = second;
        second.next = third;
        third.next = fourth;

        display(head);
        getLength(head);
    }

    private static void getLength(ListNode head) {
        ListNode ptr = head;
        int count = 0;

        while(ptr!=null){
            count++;
            ptr = ptr.next;
        }
        System.out.println("length : "+count);
    }

    
}