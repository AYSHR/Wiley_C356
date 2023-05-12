package optimization;

public class stringoptimization {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		String res="";
		for(int i=1;i<10000;i++) {
			res+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println("time taken by string : "+(end-start));
		
		
		start=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<10000;i++) {
			sb.append(i);
		}
		end=System.currentTimeMillis();
		System.out.println("time taken by string builder : "+(end-start));
	}

}
