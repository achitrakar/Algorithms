package datastructure.binaryTree;

public class BinaryTreeRecursive {
	String preorder = "";
	String inorder = "";
	String postorder = "";

	public String preorder(TreeNode root) {
		if (root != null) {
			preorder += root.data + " ";
			preorder(root.left);
			preorder(root.right);
		}
		return preorder.trim();
	}

	public String inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			inorder += root.data + " ";
			inorder(root.right);
		}
		return inorder.toString().trim();
	}

	public String postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			postorder += root.data + " ";
		}
		return postorder.toString().trim();
	}

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (leftHeight < rightHeight) {
			return rightHeight + 1;
		} else {
			return leftHeight + 1;
		}
	}
}
