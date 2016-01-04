package datastructure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeIterative extends TreeNode {

	public BinaryTreeIterative() {
		super();
	}

	public String preorderIter(TreeNode root) {
		StringBuilder order = new StringBuilder();
		if (root == null)
			return null;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {

			TreeNode tmp = stack.pop();
			order.append(tmp.data).append(" ");

			if (tmp.right != null) {
				stack.push(tmp.right);
			}
			if (tmp.left != null) {
				stack.push(tmp.left);
			}
		}
		return order.toString().trim();
	}

	public String inOrderIter(TreeNode root) {
		StringBuilder order = new StringBuilder();
		if (root == null)
			return null;

		Stack<TreeNode> stack = new Stack<TreeNode>();

		TreeNode currentNode = root;

		while (!stack.empty() || currentNode != null) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			} else {
				TreeNode tmp = stack.pop();
				System.out.print(tmp.data + " ");
				order.append(tmp.data).append(" ");
				currentNode = tmp.right;
			}
		}
		return order.toString().trim();
	}

	public String postorderIter(TreeNode root) {
		StringBuilder order = new StringBuilder();
		if (root == null) {
			return null;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode currentNode = root;
		while (true) {
			if (currentNode != null) {
				if (currentNode.right != null) {
					stack.push(currentNode.right);
				}
				stack.push(currentNode);
				currentNode = currentNode.left;
				continue;
			}
			if (stack.isEmpty()) {
				return order.toString().trim();
			}
			currentNode = stack.pop();
			if (currentNode.right != null && !stack.empty() && currentNode.right == stack.peek()) {
				stack.pop();
				stack.push(currentNode);
				currentNode = currentNode.right;
			} else {
				order.append(currentNode.data).append(" ");
				currentNode = null;
			}
		}
	}

	// This is a breadth first search (BFS)
	public String LevelOrder(TreeNode root) {
		StringBuilder order = new StringBuilder();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			order.append(tmp.data).append(" ");
			if (tmp.left != null) {
				queue.add(tmp.left);
			}
			if (tmp.right != null) {
				queue.add(tmp.right);
			}
		}
		return order.toString().trim();
	}
}
