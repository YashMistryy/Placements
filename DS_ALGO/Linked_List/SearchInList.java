package DS_ALGO.Linked_List;

public class SearchInList{
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
         SearchInList sll = new SearchInList();
         sll.head = new ListNode(343);
         ListNode second = new ListNode(23);
         ListNode third = new ListNode( 89);
         ListNode fourth = new ListNode(90);
        head.next = second;
        second.next = third;
        third.next = fourth;
        
        System.out.println(sll.searchInList(89));
        
     }
    public int searchInList(int value){
        ListNode ptr = head;
        int count=0;
        while(ptr!=null){
            ptr = ptr.next;
            count++;
            if(ptr.data == value){
                return count;
            }
        }
        return 0;

    }

  
    }   
