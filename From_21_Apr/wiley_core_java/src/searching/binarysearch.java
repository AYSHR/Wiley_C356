package searching;

public class binarysearch {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("element 4 found at index- "+ search(arr,4));
	}

	public static int search(int[] arr, int key) {
		int low=0,high=arr.length;
		while(low<high) {
			 int mid = (high + low) / 2;
			 
	            if (arr[mid] == key)
	                return mid;
	            if (arr[mid] < key)
	                low = mid + 1;
	            else
	                high = mid - 1;
		}
		
		System.out.println("not found ");
		return -1;
	}

}
