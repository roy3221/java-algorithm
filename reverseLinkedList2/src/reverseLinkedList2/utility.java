package reverseLinkedList2;

public class utility {
	 public static ListNode initialSequentialListNode(int n){
   	   	 ListNode head= new ListNode(1);
		 ListNode begin=new ListNode(2);
		 head.next=begin;
		 for(int i=3;i<=n;i++){
			 ListNode tmp= new ListNode(i);
			 begin.next=tmp;
			 begin=begin.next;
		 }
		 return head;
     }
     
     public static void printListNode(ListNode head){
   	  	ListNode point=head;
		while(point!=null){
		  System.out.print(point.val+"  ");
		  point=point.next;
		}
		System.out.println();
     }

}
