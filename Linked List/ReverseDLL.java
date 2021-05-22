package io.test.main;

import io.test.DoubleLinkedList.DoubleLinkedList;
import io.test.DoubleLinkedList.Node;

public class ReverseDLL {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();

		dll.headNode = new Node(1);
		Node node2 = new Node(2);
		dll.headNode.next = node2;
		Node node3 = new Node(3);
		node2.next = node3;
		node2.prev = dll.headNode;
		node3.prev = node2;

		printDoubleLinkedList(dll);
		reverseDoubleLinkedList(dll);
		System.out.println("After reverse:");
		printDoubleLinkedList(dll);
	}

	private static void reverseDoubleLinkedList(DoubleLinkedList dll) {
		Node headNode = dll.headNode;
		Node temp = null;
		while (headNode != null) {
			temp = headNode.prev;
			headNode.prev = headNode.next;
			headNode.next = temp;
			headNode = headNode.prev;
		}
		if (temp != null) {
			headNode = temp.prev;
		}
		dll.headNode = headNode;
	}

	private static void printDoubleLinkedList(DoubleLinkedList dll) {
		Node headNode = dll.headNode;
		while (headNode != null) {
			System.out.println(headNode.data);
			headNode = headNode.next;
		}
	}

}
