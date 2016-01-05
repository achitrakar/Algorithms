package achitrakar.sample;

/**
 * Two methods to calculate GCD between two integers using Euclid’s Algorithm.
 * 
 * @author achitrakar
 *
 */
public class GCD {
	/**
	 * Calculates GCD Iteratively.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int gcdIteratively(int x, int y) {
		int rem = 0;
		while (y != 0) {
			rem = x % y;
			x = y;
			y = rem;
		}
		return x;
	}

	/**
	 * Calculates GCD Recursively.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int gcdRecursively(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcdRecursively(y, x % y);
		}
	}
}
