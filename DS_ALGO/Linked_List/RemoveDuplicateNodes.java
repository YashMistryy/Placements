package DS_ALGO.Linked_List;

public class RemoveDuplicateNodes{
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
         RemoveDuplicateNodes sll = new RemoveDuplicateNodes();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         ListNode fourth = new ListNode(90);
        head.next = second;
        second.next = third;
        third.next = fourth;
       sll.insertAtEnd(90);
       sll.insertAtAny(23,2);

        sll.rempveDuplicate();
        display();        
     }
     public void rempveDuplicate(){
         ListNode ptr = head;
         while(ptr.next!=null){
             if(ptr.data == ptr.next.data){
                 ptr.next = ptr.next.next;
             }
             else{
                 ptr = ptr.next;
             }
         }
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
