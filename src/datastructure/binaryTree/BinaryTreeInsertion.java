package datastructure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion extends TreeNode {
	private int size = 0;

	public int getSize() {
		return size;
	}

	// Recursive insertion
	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			size++;
			return new TreeNode(value);
		}

		TreeNode currentNode = root;
		if (value < currentNode.data) {
			currentNode.left = insert(currentNode.left, value);
		} else if (value > currentNode.data) {
			currentNode.right = insert(currentNode.right, value);
		} else {
			// Node is already inserted
		}
		return root;
	}

	public void LevelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			System.out.print(tmp.data + " ");
			if (tmp.left != null) {
				queue.add(tmp.left);
			}
			if (tmp.right != null) {
				queue.add(tmp.right);
			}
		}

	}

	public TreeNode lca(TreeNode root, int v1, int v2) {

		while (root != null) {
			// If both n1 and n2 are smaller than root, then LCA lies in left
			if (root.data > v1 && root.data > v2)
				root = root.left;

			// If both n1 and n2 are greater than root, then LCA lies in right
			else if (root.data < v1 && root.data < v2)
				root = root.right;

			else
				break;
		}
		return root;

	}
}
