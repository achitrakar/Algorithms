package chapter2.sorting;

/**
 * <b>Merge Sort</b> <br/>
 * <b>BIG O NOTATION: </b> O(n) <br/>
 * - Follows Divide and Conquer apporach. <br/>
 * - Divide, Conquer and Combine. <br/>
 * <br/>
 * <b>Analogy:</b> <br/>
 * - Consider two piles of cards face up on a table.<br/>
 * - Each pile is sorted with the smallest card on top.<br/>
 * - <i>Goal: </i> Merge two files into one single sorted output pile with face
 * down on the table.<br/>
 * - <i>Step: </i> - chose smaller of the two cards on top of the face-up pile,
 * remove and place this card face down onto output pile. <br/>
 * - Repeat this untill one input pile is empty. <br/>
 * - Take the remaining input pile and place it face down onto the output pile.
 * <br/>
 * 
 * <br/>
 * <br/>
 * 
 * @author achitrakar
 *
 */
public class MergeSort {
	private static int INFINITY = 999999999;

	public static void main(String[] args) {
		int data[] = { 3, 8, 7, 5, 2, 1, 9, 6 };
		System.out.println("Before Merge Sort...");
		printArray(data);
		mergeSort(data, 0, data.length - 1);
		System.out.println("\nAfter Merge Sort...");
		printArray(data);
	}

	/**
	 * 
	 * @param data
	 *            - unsorted integer array
	 * @param startIndex
	 *            - start index of an array
	 * @param endIndex
	 *            - end index of an array
	 */
	private static void mergeSort(int[] data, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int mid = (startIndex + endIndex) / 2;
			mergeSort(data, startIndex, mid);
			mergeSort(data, mid + 1, endIndex);
			merge(data, startIndex, mid, endIndex);
		}
	}

	/**
	 * <b>Merge procedure</b> <br/>
	 * - Generates two sub arrays - left and right. <br/>
	 * - Compares values in each subarray and sorts. <br/>
	 * 
	 * @param data
	 *            - unsorted integer array
	 * @param p
	 *            - begining of an array
	 * @param q
	 *            - end of left sub-array
	 * @param r
	 *            - end of the an array
	 */
	private static void merge(int[] data, int p, int q, int r) {
		int i = 0, j = 0;

		int n1 = q - p + 1;
		int n2 = r - q;

		int left[] = new int[n1 + 1];
		int right[] = new int[n2 + 1];

		for (i = 0; i < n1; i++) {
			left[i] = data[p + i];
		}
		for (j = 0; j < n2; j++) {
			right[j] = data[q + j + 1];
		}

		// Sentinel data - filled with some large number (Infinity)
		left[n1] = INFINITY;
		right[n2] = INFINITY;

		i = 0;
		j = 0;

		for (int k = p; k <= r; k++) {
			if (left[i] <= right[j]) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
		}
	}

	private static void printArray(int[] data) {
		for (int i : data) {
			System.out.print(i + " ");
		}
	}
}
