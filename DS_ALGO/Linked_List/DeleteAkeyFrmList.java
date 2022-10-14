package Linked_List;

public class DeleteAkeyFrmList{
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
         DeleteAkeyFrmList sll = new DeleteAkeyFrmList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         
        head.next = second;
        second.next = third;
        
        sll.removeAkey(343);
         display();
        
     }
     public void removeAkey(int data){
         
         ListNode ptr = head;
         ListNode prvs = null;

        //  remove the node having data == this.data
        if(ptr.data == data && ptr !=null){
            head = head.next;
            return;
        }
        while(ptr!=null && ptr.data != data){        
            prvs = ptr;
            ptr = ptr.next;
        }
        if(ptr == null) return;
        prvs.next = ptr.next;

     }


  
    }   
