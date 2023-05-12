package optimization;

public class strengthreduction {
// *-->+
	//code movement->moving code out of loop
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum*sum;
	}
	
	public static int sum1(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=(arr[i]*arr[i]);
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(sum(arr));
		System.out.println(sum1(arr));
	}

}
