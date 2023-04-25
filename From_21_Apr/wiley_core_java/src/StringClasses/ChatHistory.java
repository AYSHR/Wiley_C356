package StringClasses;

public class ChatHistory {

	public static void main(String[] args) {
		StringBuffer history=new StringBuffer();
		String sender="p1";
		String msg="hello p1";
		history.append(sender).append(":").append(msg).append("\n");
		sender="p2";
		msg="how are you?";
		history.append(sender).append(":").append(msg);
		System.out.println(history.toString());

	}

}
