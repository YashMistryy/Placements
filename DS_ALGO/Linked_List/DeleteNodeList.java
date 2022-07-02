package DS_ALGO.Linked_List;

public class DeleteNodeList{
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
         DeleteNodeList sll = new DeleteNodeList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         
        head.next = second;
        second.next = third;
        
        sll.deleteAtAny(1);
         display();
        
     }
     public void deleteAtBegin(){
         if(head == null){
             System.out.println("the list is empty , cannot delete from beginning");
             return;
         }
         ListNode ptr = head;
         head = head.next;
         ptr.next = null;
     }
     public void deleteAtEnd(){
        if(head == null){
            System.out.println("the list is empty , cannot delete from end");
            return;
        }
         ListNode ptr = head;
         ListNode prvs = null;
         while(ptr.next != null){
             prvs = ptr;
             ptr = ptr.next;
         }
         prvs.next = null;
         ptr = null;
     }
     public void deleteAtAny(int index){
         ListNode ptr = head;
         ListNode prvs = null;

        //  first get the element to be deleted

        while(index > 0){
            prvs = ptr;
            ptr = ptr.next;
            index--;
        }
        prvs.next = ptr.next;
        ptr = null;
     }


  
    }   
