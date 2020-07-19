package io.test.Trees;

public class ValidateBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
//		root.leftNode = new TreeNode(1);
//		root.leftNode.leftNode = new TreeNode(3);
//		root.leftNode.rightNode = new TreeNode(6);

//		root.rightNode = new TreeNode(4);
//		root.rightNode.leftNode = new TreeNode(3);
//		root.rightNode.rightNode = new TreeNode(6);
		System.out.println(isValidBST(root));

	}

	static int[] inorder = new int[100];
	static int count = 0;

	public static boolean isValidBST(TreeNode root) {
		if (root != null) {
			inorder(root);
			if (count == 0)
				return true;
			for (int i = 0; i < count - 1; i++) {
				if (inorder[i] > inorder[i + 1])
					return false;
			}
		}
		return true;
	}

	private static void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.leftNode);
		inorder[count] = root.data;
		count++;
		inorder(root.rightNode);
	}

//	private static boolean validateBST(TreeNode root, Integer max, Integer min) {
//		if (root == null)
//			return true;
//		if (root.leftNode.data < min || root.rightNode.data < max)
//			return false;
//
//		return validateBST(root.leftNode, root.data, 0) && validateBST(root.rightNode, 0, root.data);
//
//	}
}
