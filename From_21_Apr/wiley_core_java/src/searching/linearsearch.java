package searching;

public class linearsearch {
public static int linear(int arr[],int key) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			return i;
		}
	}
	System.out.println("not found ");
	return -1;
}
	public static void main(String[] args) {
		int arr[]= {10,5,3,4,8,9};
		
		System.out.println("element 4 found at index- "+linear(arr,4));

	}

}
