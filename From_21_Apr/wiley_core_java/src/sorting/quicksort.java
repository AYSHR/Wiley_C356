package sorting;

public class quicksort {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 8, 9 };
		int n = arr.length;
		quick(arr, 0, n - 1);

		print(arr);

	}

	public static void quick(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int pivot = partition(arr, low, high);
		quick(arr, low, pivot - 1);
		quick(arr, pivot + 1, high);

	}

	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low + 1;
		int j = high;
		while (i <= j) {
			if (arr[i] <= pivot) {
				i++;
			} else if (arr[j] > pivot) {
				j--;
			} else {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}

		int tmp = arr[low];
		arr[low] = arr[j];
		arr[j] = tmp;

		return j;
	}

}
