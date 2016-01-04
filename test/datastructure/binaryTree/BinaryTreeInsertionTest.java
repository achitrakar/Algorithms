package datastructure.binaryTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeInsertionTest {

	private BinaryTreeInsertion bi;
	private TreeNode rootNode;

	@Before
	public void init() {
		bi = new BinaryTreeInsertion();
		rootNode = null;
	}

	@Test
	public void testSize() {
		rootNode = bi.insert(rootNode, 8);
		rootNode = bi.insert(rootNode, 4);
		rootNode = bi.insert(rootNode, 9);

		Assert.assertEquals(3, bi.getSize());
	}

	@Test
	public void testSizeWithDuplicate() {
		rootNode = bi.insert(rootNode, 7);
		rootNode = bi.insert(rootNode, 8);
		rootNode = bi.insert(rootNode, 4);
		rootNode = bi.insert(rootNode, 9);
		rootNode = bi.insert(rootNode, 4);

		Assert.assertEquals(4, bi.getSize());
	}
}
