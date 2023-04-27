package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {

	public static void main(String[] args) {
		String cardno="4560-7689-0007-0222";
		Pattern pattern=Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher mt=pattern.matcher(cardno);
		String masked=mt.replaceAll("xxxx xxxx xxxx ");
		System.out.println(cardno);
		System.out.println(masked);

	}

}
