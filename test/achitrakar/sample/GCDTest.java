package achitrakar.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Two methods to calculate GCD between two integers using Euclid’s Algorithm.
 * 
 * @author achitrakar
 *
 */
public class GCDTest {
	GCD gcdCalulator = new GCD();
	int val1 = 1005;
	int val2 = 55;

	/**
	 * Tests gcdIteratively and gcdRecursively
	 */
	@Test
	public void test_iteratively_vs_recursively() {
		Assert.assertEquals(gcdCalulator.gcdIteratively(val1, val2), gcdCalulator.gcdRecursively(val1, val2));
	}

	/**
	 * Tests gcdIteratively
	 */
	@Test
	public void test_iteratively() {
		Assert.assertEquals(gcdCalulator.gcdIteratively(val1, val2), gcdCalulator.gcdIteratively(val2, val1));
	}

	/**
	 * Tests gcdRecursively
	 */
	@Test
	public void test_recursively() {
		Assert.assertEquals(gcdCalulator.gcdRecursively(val1, val2), gcdCalulator.gcdRecursively(val2, val1));
	}
}
