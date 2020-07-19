package io.test.Trees;

public class ValidBSTRecursion {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.leftNode = new TreeNode(1);
//		root.leftNode.leftNode = new TreeNode(3);
//		root.leftNode.rightNode = new TreeNode(6);

		root.rightNode = new TreeNode(3);
//		root.rightNode.leftNode = new TreeNode(3);
//		root.rightNode.rightNode = new TreeNode(6);
		System.out.println(isValidBST(root));
	}

	private static boolean isValidBST(TreeNode root) {
		return isValid(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private static boolean isValid(TreeNode root, Integer max, Integer min) {
		if (root == null)
			return true;
		int val = root.data;
		if (min != null && val <= min)
			return false;
		if (max != null && val >= max)
			return false;

		return isValid(root.leftNode, root.data, min) && isValid(root.rightNode, max, root.data);
	}

}
