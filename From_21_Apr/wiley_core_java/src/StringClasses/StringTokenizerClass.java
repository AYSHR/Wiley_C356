package StringClasses;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		String i="today, is, sunday";
		StringTokenizer st1 =new StringTokenizer(i,",");
		StringTokenizer st =new StringTokenizer("today is sun");
     System.out.println(st.countTokens());
	while(st.hasMoreElements()) {
		System.out.println(st.nextToken());
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextToken().trim());
	}
	}

}
}
