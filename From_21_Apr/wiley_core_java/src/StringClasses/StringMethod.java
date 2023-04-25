package StringClasses;

public class StringMethod {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		String s3= new String("abc");
		String s4= new String("abc");
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s3==s4);
		String str4="java dev";
		String str5="python dev";
		System.out.println(str4.concat(str5));
		String st[]=str4.split("");
		for(String s: st) {
			System.out.println(s);
		}
		System.out.println(str4.replace('a','m'));
		

	}

}
