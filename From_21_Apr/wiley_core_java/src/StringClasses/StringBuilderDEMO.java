package StringClasses;

public class StringBuilderDEMO {

	public static void main(String[] args) {
		StringBuilder logmsg=new StringBuilder();
		long timestamp=System.currentTimeMillis();
		logmsg.append("[").append(timestamp).append("] ");
		int userid=1234;
		String msg="log in successful";
		logmsg.append("user ").append(userid).append(":" ).append(msg);
		System.out.println(logmsg.toString());

	}

}
