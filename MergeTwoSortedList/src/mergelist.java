
public class mergelist {
	  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode result= new ListNode(0);
	        if(l1==null&&l2==null) return null;
	        if(l1.next==null&&l1.val>l2.val) {
	            if(l1.val>l2.val||l1.val==l2.val){
	                 result=l2;
	             ListNode temp= new ListNode(0);
	            while(l2.next!=null){
	                temp=l2;
	                l2=l2.next;
	            }
	            temp.next=l1;
	            }else{
	            result=l1;
	            l1.next=l2;}
	            return result;
	        }
	        if(l2.next==null&&l1.val>l2.val){
	                result=l2;
	               ListNode temp= new ListNode(0);
	             while(l1.next!=null){
	                temp=l1;
	                l1=l1.next;
	            }
	            temp.next=l2;
	            result=l1;
	            return result;
	            
	        }
	        while(l1.next!=null&&l2.next!=null){
	            if(l1.val>l2.val){
	                result=l1;
	                l1=l1.next;
	            }else 
	            result=l2;
	            l2=l2.next;
	        }
	        return result;
	    }
}
