
public class Solution {
	public ListNode partition(ListNode head, int x) {
        if (head == null)
            return head;
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode result = small;
        ListNode half = large;
        while( head != null){
            if ( head.val < x){
                small.next = head;
                small = small.next;
            }else{
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next =null;
        small.next = half.next;
        return result.next;
    }
}
