package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		//String text="agent 0077";
		//String re="agent \\d\\d\\d";
		//{min,max} char quantifiers
		// ^ means begin with
		// $ ends with
		// | means or
		String text="agent 0077";
		String re="[a|A]gent (\\d{3,4})$";
		Pattern pattern=Pattern.compile(re);
		Matcher mt=pattern.matcher(text);
//		/*
//		 * boolean res=mt.matches(); boolean found=mt.find();
//		 * System.out.println("pattern matched :"+res);
//		 * System.out.println("pattern found :"+found);
//		 */
		if(mt.find()) {
			System.out.println("group : "+mt.group());
			System.out.println("group : "+mt.group(1));
		}
	}

}
