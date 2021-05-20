package io.test.main;

import io.test.LinkedList.LinkedList;
import io.test.LinkedList.Node;

public class LinkedListOps {

	public static void main(String[] args) {
		LinkedList ls1 = new LinkedList();
		ls1.head = new Node(1);
		Node node2 = new Node(2);
		ls1.head.next = node2;
		Node node3 = new Node(3);
		node2.next = node3;
		printLinkedList(ls1.head);
		// Node to be deleted can never be the last node.
		deleteNode(node2);
		System.out.println("");
		printLinkedList(ls1.head);
	}

	private static void deleteNode(Node delNode) {
		delNode.data = delNode.next.data;
		delNode.next = delNode.next.next;
	}

	private static void printLinkedList(Node headNode) {
		Node head = headNode;
		while (head != null) {
			System.out.print(head.data);
			head = head.next;
		}
	}

}
