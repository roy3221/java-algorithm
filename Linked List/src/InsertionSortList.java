
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
        ListNode sortedHead = new ListNode(0); // the head of the sorted list.
        ListNode curNode = head; // current node that need to be inserted.
        ListNode pointer = sortedHead; // a pointer to find a position for inserting.
        ListNode nextNode = null;
        while(curNode != null) {
            nextNode = curNode.next;
            // find the position for inserting the node
            while(pointer.next != null && pointer.next.val < curNode.val) pointer = pointer.next;
            // insert the current node to sortedList.
            curNode.next = pointer.next;
            pointer.next = curNode;
           // reset pointer to the head of the sorted list;
            pointer = sortedHead;
            // move to next node that need to be inserted;
            curNode = nextNode;
        }
        return sortedHead.next;
    }

}
