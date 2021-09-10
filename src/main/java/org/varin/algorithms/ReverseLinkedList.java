package org.varin.algorithms;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		} else {
			ListNode nextNode = head.next;
			ListNode newHead = reverseList(nextNode);
			nextNode.next = head;
			head.next = null;
			return newHead;
		}
	}

	public ListNode reverseListIterative(ListNode head) {

		ListNode pre = null;

		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}

		return pre;

	}

	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = null;
		reverseLinkedList.reverseList(one);
	}
}
