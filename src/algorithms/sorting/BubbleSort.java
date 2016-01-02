package algorithms.sorting;

/**
 * <b>Bubble Sort</b> <br/>
 * 
 * @author achitrakar
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int data[] = { 3, 41, 52, 26, 38, 57, 9, 49 };
		System.out.println("Before Bubble Sort...");
		printArray(data);
		bubbleSort(data);
		System.out.println("\nAfter Bubble Sort...");
		printArray(data);
	}

	private static void bubbleSort(int[] data) {
		int temp;
		for (int i = 0; i < data.length - 2; i++) {
			for (int j = data.length - 1; j > 0; j--) {
				if (data[j] < data[j - 1]) {
					temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
				}
			}
		}
	}

	private static void printArray(int[] data) {
		for (int i : data) {
			System.out.print(i + " ");
		}
	}
}
