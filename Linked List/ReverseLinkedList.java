package io.test.LinkedLists;

import java.util.Stack;

public class ReverseLinkedList {
//	private static ListNode prev = new ListNode();

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
		print(root);
		System.out.println("");
		ListNode rever = reverseList(root);

		print(rever);

	}

	public static ListNode reverseList(ListNode root) {
		Stack<ListNode> nodes = new Stack<>();

		while (root != null) {
			nodes.add(root);
			root = root.next;
		}
		ListNode res = new ListNode(1);
		root = res;
		while (!nodes.isEmpty()) {
			ListNode curr = nodes.pop();
			root.next = new ListNode(curr.val);
			root = root.next;

		}

		return res.next;
//		if (root == null || root.next == null)
//			return root;
//		ListNode p = reverseList(root.next);
//		root.next.next = root;
//		root.next = null;
//		return p;
	}

	private static void print(ListNode root) {
		while (root != null) {
			System.out.print(root.val + " ");
			root = root.next;
		}

	}

}
