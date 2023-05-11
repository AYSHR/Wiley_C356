package sorting;

public class sortingalgo {

	public static void main(String[] args) {
		int arr[]= {10,5,3,4,8,9};
		int n=arr.length;
	  // bubble(arr, n);
	   
	   insertion(arr,n); 

	}

	//quad order of growth-suitable for small list
	//time comp.- o(n^2)
	//more efficient than bubble sort if list is nearly sorted
	public static void insertion(int[] arr, int n) {
		for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	//quad order of growth-suitable for small list
//time comp.- o(n^2)
	public static void bubble(int[] arr, int n) {
		for (int pass = 0; pass < n - 1; pass++)
            for (int j = 0; j < n - pass - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
		
	
	for(int i: arr) {
		System.out.print(i+" ");
	}

}
}
