package reverseLinkedList2;

public class solution {

	
	 
	 public static ListNode reverseBetween(ListNode head, int m, int n) {
	        ListNode begin= head;
	        ListNode end=head;
	        int len=n-m;
	        if(len<=0) 
	        return head;
	        while(len>0){
	            len--;
	            end=end.next;
	        }
	        while(m>0){
	            begin=begin.next;
	            end=end.next;
	            m--;
	        }
	        System.out.println();
	        utility.printListNode(end);
	        ListNode tailHead=end.next;
	        utility.printListNode(begin);
	        end.next=null;
	        ListNode newHead= begin.next;
	        utility.printListNode(newHead);
	        begin.next=reverse(newHead);
	        while(newHead.next!=null){
	        	newHead=newHead.next;
	        }
	        newHead.next=tailHead;
	        return head;
	    }
	 
	
     public static ListNode reverse(ListNode head){
    	 ListNode pre=null;
         ListNode current= head;
         ListNode next;
         while(current!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
         }
         return pre;
     }
     
	 public static void main(String args[]){
		 ListNode head=utility.initialSequentialListNode(3);
		 utility.printListNode(head);
		 ListNode result=reverseBetween(head,1,3);
		 utility.printListNode(result);
	 }
		 
	 
}
