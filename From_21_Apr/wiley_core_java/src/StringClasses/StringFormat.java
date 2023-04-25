package StringClasses;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		String title="java developer";
		float sal=231.3999f;
		System.out.format("%s has %.2f salary%n",title,sal);
	List<String> tech=Arrays.asList("java1","java2","java3");
	for(String book: tech) {
		System.out.format("%-30s -instock%n", book);
	}
	
	}

}
