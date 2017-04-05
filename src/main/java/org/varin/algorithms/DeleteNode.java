package org.varin.algorithms;

public class DeleteNode {
	public void deleteNode(ListNode node) {
		node = node.next;
//		node.val = next.val;
//		node.next = next.next;
	}

	public static void main(String[] args) {
		DeleteNode deleteNode = new DeleteNode();
		ListNode one = deleteNode.new ListNode(1);
		ListNode two = deleteNode.new ListNode(2);
		ListNode three = deleteNode.new ListNode(3);
		ListNode four = deleteNode.new ListNode(4);
		ListNode five = deleteNode.new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		
		ListNode node = one;
		
		while (true) {
			System.out.println("Before: " + node.val);
			node = node.next;
			if (null == node) {
				break;
			}
		}
		
		deleteNode.deleteNode(three);
		
		node = one;
		
		while (true) {
			System.out.println("After: " + node.val);
			node = node.next;
			if (null == node) {
				break;
			}
		}
	}
	
	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
