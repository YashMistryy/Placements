package Linked_List;
// this is floyd loop detection method/algoritm to find loop in a sll

public class RemoveLoopFromList{
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
         RemoveLoopFromList sll = new RemoveLoopFromList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         ListNode fourth = new ListNode(55);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
       
        System.out.println(sll.removeLoop());
         display();
        
     }
     public ListNode removeLoop(){
         ListNode fastptr = head;
         ListNode slowptr = head;

        //  detect if list in loop

        while(fastptr!=null && fastptr.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastptr){
                adjustEndOfList(slowptr);
                return slowptr;
        }}
       return null;

      
        }

    private void adjustEndOfList(ListNode slowptr) {
        ListNode ptr = head;
        ListNode prvs  = slowptr;
        while(slowptr!= ptr){
            prvs = slowptr;
            slowptr = slowptr.next;
            ptr = ptr.next;
        }
        prvs.next = null;
    }   
    }
