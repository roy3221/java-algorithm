package reverseLinkedList2;

public class test {
	public static void main(String args[]){
		ListNode l1=utility.initialSequentialListNode(3);
		ListNode l2=utility.initialSequentialListNode(4);
		utility.printListNode(l1);
		utility.printListNode(l2);
		utility.printListNode(Solution2.addTwoNumbers(l1, l2));
	}

}
