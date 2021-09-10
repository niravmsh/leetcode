package org.varin.algorithms;

public class DeleteNode {
	public void deleteNode(ListNode node) {
		node = node.next;
	}

	public static void main(String[] args) {
		DeleteNode deleteNode = new DeleteNode();
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;

		ListNode node = one;

		while (true) {
			node = node.next;
			if (null == node) {
				break;
			}
		}

		deleteNode.deleteNode(three);

		node = one;

		while (true) {
			node = node.next;
			if (null == node) {
				break;
			}
		}
	}
}
