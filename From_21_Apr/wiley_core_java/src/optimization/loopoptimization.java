package optimization;

public class loopoptimization {

	public static void main(String[] args) {
		
		//inefficient way is using for loop more time taken
		long start=System.currentTimeMillis();
		int[] arr=new int[100000];
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;
		//	System.out.println(arr[i]);
		}
		long end=System.currentTimeMillis();
		System.out.println("time taken by for : "+(end-start));
	
		
		//efficient way is using for-each loop
		start=System.currentTimeMillis();
		int[] array1=new int[100000];
		for(int i :array1) {
			i++;
			//System.out.println(i);
		}
		end=System.currentTimeMillis();
		System.out.println("time taken by for-each : "+(end-start));
	
	}

}
