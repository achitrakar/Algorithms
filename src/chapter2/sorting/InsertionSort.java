package chapter2.sorting;

/**
 * <b>Insertion Sort </b><br/>
 * - Efficient algorithm for sorting a small number of elements.<br/>
 * - Analogous to playing card. <br/>
 * - Sorts input number in place.<br/>
 * <br/>
 * 
 * The time taken by the INSERTION-SORT procedure depends on the input size.
 * <br/>
 * <br/>
 * 
 * <b>BEST CASE:</b> - Array is already sorted - <i>Linear function of n</i>
 * <br/>
 * <b>WORST CASE:</b> - Array is reverse sorted. - <i>Quadratic function of
 * n</i> <br/>
 * 
 * @author achitrakar
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int data1[] = { 31, 41, 59, 26, 41, 58 };
		int data2[] = data1;
		data1 = insertionSortAscending(data1);
		System.out.println("Final Result: ");
		printArray(data1);
		System.out.println("\n");
		data2 = insertionSortDescending(data2);
		System.out.println("Final Result: ");
		printArray(data2);
	}

	private static void printArray(int[] data) {
		for (int i : data) {
			System.out.print(i + " ");
		}
	}

	/**
	 * This method takes an array of integer and sorts the elements in ascending
	 * order.
	 * 
	 * @param data
	 *            - array of integer
	 * @return sorted array of integer in <b>ascending</b> order.
	 */
	private static int[] insertionSortAscending(int[] data) {
		System.out.println("Original Array:");
		printArray(data);
		System.out.println("\nSorting...");

		for (int j = 1; j < data.length; j++) {
			int key = data[j];
			int i = j - 1;
			while (i >= 0 && data[i] > key) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
			printArray(data);
			System.out.println("");
		}
		return data;
	}

	/**
	 * This method takes an array of integer and sorts the elements in
	 * descending order.
	 * 
	 * @param data
	 *            - array of integer
	 * @return sorted array of integer in <b>descending</b> order.
	 */
	private static int[] insertionSortDescending(int[] data) {
		System.out.println("Original Array:");
		printArray(data);
		System.out.println("\nSorting Descending...");

		for (int j = 1; j < data.length; j++) {
			int key = data[j];
			int i = j - 1;
			while (i >= 0 && data[i] < key) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
			printArray(data);
			System.out.println("");
		}
		return data;
	}
}
