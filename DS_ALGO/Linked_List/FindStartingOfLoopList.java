package Linked_List;
// this is floyd loop detection method/algoritm to find loop in a sll

public class FindStartingOfLoopList{
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
         FindStartingOfLoopList sll = new FindStartingOfLoopList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
                 head.next = second;
        second.next = third;
       
        System.out.println(sll.detectLoop().data);
        //  display();
        
     }
     public ListNode detectLoop(){
         ListNode fastptr = head;
         ListNode slowptr = head;

        //  detect if list in loop

        while(fastptr!=null && fastptr.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastptr){
                getLoopHead(slowptr);
                return slowptr;
        }}
       return null;

      
        }

    private ListNode getLoopHead(ListNode slowptr) {
        ListNode ptr = head;
        while(slowptr!= ptr){
            slowptr = slowptr.next;
            ptr = ptr.next;
        }
        return slowptr;
    }   
    }
