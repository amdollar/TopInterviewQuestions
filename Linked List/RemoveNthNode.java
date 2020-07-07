package io.test.LinkedLists;

public class RemoveNthNode {

	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		ListNode nurs = new ListNode(2);
		root.next = nurs;
		ListNode one = new ListNode(3);
		nurs.next = one;
		ListNode two = new ListNode(5);
		one.next = two;
		ListNode three = new ListNode(9);
		two.next = three;
		removeNthFromEnd(root, 3);
		System.out.println("");
		countNodes(root);

	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {
		int totalNodes = countNodes(head);
		int visit = totalNodes - n;
		while (visit > 0) {
			head = head.next;
			visit--;
		}
		head.val = head.next.val;
		head.next = head.next.next;

		return head;
	}

	private static int countNodes(ListNode root) {
		int count = 0;
		while (root != null) {
			count++;
			System.out.print(root.val + " ");
			root = root.next;
		}
		return count;
	}
}
