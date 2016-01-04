package datastructure.binaryTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeItterativeTest {

	private BinaryTreeIterative bi;
	private TreeNode rootNode;

	@Before
	public void init() {
		bi = new BinaryTreeIterative();

		rootNode = createBinaryTree();
	}

	@Test
	public void testPreorder() {
		Assert.assertEquals("3 5 1 4 2 6 7", bi.preorderIter(rootNode));
	}

	@Test
	public void testInorder() {
		Assert.assertEquals("1 5 4 3 7 6 2", bi.inOrderIter(rootNode));
	}

	@Test
	public void testPostorder() {
		Assert.assertEquals("1 4 5 7 6 2 3", bi.postorderIter(rootNode));
	}

	@Test
	public void testLevelorder() {
		Assert.assertEquals("3 5 2 1 4 6 7", bi.LevelOrder(rootNode));
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		rootNode.setLeft(node5);
		rootNode.setRight(node2);

		node5.setLeft(node1);
		node5.setRight(node4);

		node2.setLeft(node6);

		node6.setLeft(node7);

		return rootNode;
	}
}
