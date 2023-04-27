package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic {

	public static void main(String[] args) {
		//String re="..";
		// \\s IS FOR 1 SPACE
		// \\S for no-space word char
		// \\d is for 1 digit
		// \\D is for 1 non-digit char
		String text="s ";
	//	String re="\\w\\w\\w\\W.";
		String re="\\S\\s";
		// \\W IS FOE NON-WORD CHAR - SPECIAL CHAR, SYMBOL
		// \\w is for 1 char valid for(a-z, A-z, 0-9 ,_) not for other sp. char
		// . means 1 character(no./alpha/special char)
		//.. means only 2 char
		Pattern pattern=Pattern.compile(re);
		Matcher mt=pattern.matcher(text);
		boolean res=mt.matches();
		System.out.println(res);

	}

}
