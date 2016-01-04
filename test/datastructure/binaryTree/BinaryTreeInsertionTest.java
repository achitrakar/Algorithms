package datastructure.binaryTree;

public class BinaryTreeInsertionTest {

	public static void main(String[] args) {
		BinaryTreeInsertion bi = new BinaryTreeInsertion();
		// Creating a binary tree
		// TreeNode rootNode = createBinaryTree();
		TreeNode rootNode = null;
		System.out.println("Binary Tree Insertion:");

		// testcase2
		rootNode = bi.insert(rootNode, 8);
		rootNode = bi.insert(rootNode, 4);
		rootNode = bi.insert(rootNode, 9);
		rootNode = bi.insert(rootNode, 1);
		rootNode = bi.insert(rootNode, 2);
		rootNode = bi.insert(rootNode, 3);
		rootNode = bi.insert(rootNode, 6);
		rootNode = bi.insert(rootNode, 5);

		bi.LevelOrder(rootNode);

		System.out.println(">> " + bi.lca(rootNode, 1, 2).getData()); //
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node7 = new TreeNode(7);

		rootNode.setLeft(node2);
		rootNode.setRight(node7);

		node2.setLeft(node1);
		node2.setRight(node3);

		return rootNode;
	}
}
