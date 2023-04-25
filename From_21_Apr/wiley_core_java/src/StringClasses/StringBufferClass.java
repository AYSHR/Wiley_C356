package StringClasses;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("wiley");
		StringBuffer sb1=new StringBuffer("wiley");
		System.out.println(sb);
		System.out.println(sb.equals(sb1));
		sb.append("edge");
		System.out.println(sb);
		sb.insert(4," edge");
		System.out.println(sb);
		String s="wiley";
		System.out.println(s.equals(sb));
		System.out.println(s.equals(sb.toString()));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(5, 7));
		

	}

}
