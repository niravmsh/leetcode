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
}
