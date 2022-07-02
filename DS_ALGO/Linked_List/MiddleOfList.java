package DS_ALGO.Linked_List;

public class MiddleOfList{
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
         MiddleOfList sll = new MiddleOfList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         ListNode fourth = new ListNode(90);
         ListNode fifth = new ListNode(99);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sll.insertAtBegin(76);
        System.out.println( sll.findMiddle());
        display();        
     }
     public int findMiddle(){
     ListNode ptr = head;
     int result=0;
     int count =0;
     while(ptr!=null){
         ptr = ptr.next;
         count++;
     }
     ptr = head;
     count = count/2;
      while(count>0){
          ptr = ptr.next;

          count--;
      }
      result = ptr.data;

     return result;
     }
     private void insertAtBegin(int data) {
        ListNode newHead = new ListNode(data);
        newHead.next = head;
        head = newHead;
    }
    }   
