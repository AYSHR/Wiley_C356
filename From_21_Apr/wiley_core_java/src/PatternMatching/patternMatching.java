package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {

	public static void main(String[] args) {
		String input="the key to LEARN programming is consistent practice";
		Pattern pattern=Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(input);
		//System.out.println(matcher.find());
		if(matcher.find()) {
			int start=matcher.start();
			int end=matcher.end();
			System.out.println("found match at index "+start+" "+(end-1));
		
	/*	String pat="learn";
		int index=input.indexOf(pat);
		if(index!=-1) {
			System.out.println(index);
		}
		} */

	}
	}
}
