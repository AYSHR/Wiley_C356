package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {

	public static void main(String[] args) {
		String input="10 divide by 5";
		Pattern pattern=Pattern.compile("(\\d+) divide by (\\d+)");
		Matcher mt=pattern.matcher(input);
		if(mt.find()) {
			String msg="result = "+ mt.replaceFirst("$1/$2");
			System.out.println(msg);
			int res=Integer.valueOf(mt.group(1))/Integer.valueOf(mt.group(2));
			System.out.println("final result = "+ res);
		}

	}

}
