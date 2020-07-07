package io.test.LinkedLists;

public class MergeLists {

	public static void main(String[] args) {
		ListNode root = null;
		printList(root);

		System.out.println(" ");

		ListNode root2 = new ListNode(1);
		ListNode one2 = new ListNode(3);
		root2.next = one2;
		ListNode three2 = new ListNode(4);
		one2.next = three2;
		printList(root2);
		ListNode result = mergeTwoLists(root, root2);
		System.out.println(" ");
		printList(result);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode result = new ListNode(-1);
		ListNode prev = result;
		int curr1 = Integer.MAX_VALUE;
		int cur2 = Integer.MAX_VALUE;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				curr1 = l1.val;
			}
			if (l2 != null) {
				cur2 = l2.val;
			}
			if (curr1 > cur2) {
				prev.next = new ListNode(cur2);
				l2 = l2.next;
				cur2 = Integer.MAX_VALUE;
			} else {
				prev.next = new ListNode(curr1);
				l1 = l1.next;
				curr1 = Integer.MAX_VALUE;
			}
			prev = prev.next;
		}
		return result.next;
	}

	private static void printList(ListNode root) {
		while (root != null) {
			System.out.print(root.val + " ");
			root = root.next;
		}
	}

}
