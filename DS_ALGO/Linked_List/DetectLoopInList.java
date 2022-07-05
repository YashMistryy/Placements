package DS_ALGO.Linked_List;


public class DetectLoopInList{
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
         DetectLoopInList sll = new DetectLoopInList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
                 head.next = second;
        second.next = head;
        System.out.println(sll.detectLoop());
        //  display();
        
     }
     public boolean detectLoop(){
         ListNode fastptr = head;
         ListNode slowptr = head;

        //  detect if list in loop

        while(fastptr!=null && fastptr.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastptr)
            return true;
        }
        return false;    
      
        }   }
