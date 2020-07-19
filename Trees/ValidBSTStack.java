package io.test.Trees;

import java.util.Stack;

/**
 * 
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 */
public class ValidBSTStack {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.leftNode = new TreeNode(1);
		root.leftNode.leftNode = new TreeNode(3);
		root.leftNode.rightNode = new TreeNode(6);

		root.rightNode = new TreeNode(4);
		root.rightNode.leftNode = new TreeNode(3);
		root.rightNode.rightNode = new TreeNode(6);
		System.out.println(isValidBST(root));
	}

	public static boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		int minval = Integer.MIN_VALUE;
		stack.add(root);

		while (!stack.isEmpty() || root != null) {
			while (root != null) {
				stack.push(root.leftNode);
				root = root.leftNode;
			}
			root = stack.pop();

			if (root.data < minval) {
				return false;
			}
			minval = root.data;
			root = root.rightNode;
		}
		return true;
	}
}
