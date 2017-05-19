package org.varin.algorithms;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		ListNode first = new ListNode(head.val);

		while (head.next != null) {
			head = head.next;
			if (first.val == head.val) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedListCycle callingObject = new LinkedListCycle();
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(-4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		n4.next = n1;

		boolean output = callingObject.hasCycle(n1);
		System.out.println("expected: true " + "actual: " + output);
	}
}
