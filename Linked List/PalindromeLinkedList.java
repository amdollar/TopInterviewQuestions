package io.test.LinkedLists;

import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode root = new ListNode(-129);
		ListNode one = new ListNode(-129);
		root.next = one;
//		ListNode two = new ListNode(-129);
//		one.next = two;
//		ListNode three = new ListNode(1);
//		two.next = three;
		System.out.println(isPalindrome(root));
	}

	public static boolean isPalindrome(ListNode head) {
		// insert all nodes into one stack
		ListNode temp = head;
		Stack<ListNode> stack = new Stack<>();

		while (head != null) {
			stack.add(head);
			head = head.next;
		}
		while (!stack.isEmpty()) {
			ListNode curr = stack.pop();
			if (curr.val != temp.val)
				return false;
			temp = temp.next;
		}

		return true;
	}
}

/**
 * 
 * 
 * String str = getString(head); if (str.isEmpty()) return true; int left = 0;
 * int right = str.length() - 1; while (left <= right / 2) { if
 * (str.charAt(left) != str.charAt(right)) return false; left++; right--; }
 * return true; }
 * 
 * private static String getString(ListNode root) { StringBuilder sb = new
 * StringBuilder(); while (root != null) { sb.append(root.val); root =
 * root.next; } return sb.toString(); }
 * 
 */