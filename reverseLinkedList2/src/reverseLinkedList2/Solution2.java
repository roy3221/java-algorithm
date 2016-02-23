package reverseLinkedList2;

public class Solution2 {
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 if(l1==null) return l2;
	        if(l2==null) return l1;
	        ListNode res;
	        int flag;
	        int sum=l1.val+l2.val;
	        if(sum<10){
	            res= new ListNode(sum);
	            flag=0;
	        }
	        else{
	            res= new ListNode(sum-10);
	            flag=1;
	            System.out.println("a");
	        }
	        ListNode pointer=res;
	        while(l1.next!=null&&l2.next!=null){
	            l1=l1.next;
	            l2=l2.next;
	            sum=l1.val+l2.val;
	            if(flag==1){
	            sum=sum+1;
	            flag=0;                
	            }
	            if(sum<10){
	                pointer.next= new ListNode(sum);
	            }else{
	                pointer.next= new ListNode(sum-10);
	                flag=1;
	            }
	            pointer=pointer.next;
	        }
	        while(l1.next!=null){
	            l1=l1.next;
	            sum=l1.val+flag;
	            if(sum<10){
	           pointer.next=new ListNode(sum);
	           flag=0;     
	            }
	           else{
               pointer.next=new ListNode(sum-10);
               flag=1;
	           }
	           pointer=pointer.next;
	        }
	        while(l2.next!=null){
	           l2=l2.next;
    	       sum=l2.val+flag;
	            if(sum<10){
	           pointer.next=new ListNode(sum);
	           flag=0;     
	            }
	           else{
               pointer.next=new ListNode(sum-10);
               flag=1;

	           }
	           pointer=pointer.next;

	        }
	        if(flag==1){
	            pointer.next=new ListNode(1);
	            pointer=pointer.next;
	        }
	        return res;
	    }
}
