package DS_ALGO.Linked_List;

public class ReverseAList{
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
         ReverseAList sll = new ReverseAList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         ListNode fourth = new ListNode(90);
        head.next = second;
        second.next = third;
        third.next = fourth;
        
        sll.reverseAList();
        display();        
     }
     public void reverseAList(){
         ListNode ptr = head;
         ListNode prvs = null;
         ListNode next = null;

         while(ptr!=null){
             next = ptr.next;
             ptr.next = prvs;
             prvs = ptr;
             ptr = next;
         }
         head = prvs;

     }
  
    }   
