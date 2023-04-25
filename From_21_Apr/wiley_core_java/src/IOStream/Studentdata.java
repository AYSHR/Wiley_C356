package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Studentdata {
	String name,grade,gender;
	int age;
	public void name(String nam,String grade,String gender,int age) {
		this.name=nam;
		this.grade=grade;
		this.gender=gender;
		this.age=age;
	}

	public static void main(String[] args) throws IOException {
		Studentdata s=new Studentdata();
		s.name("harry","a","M",21);
		FileOutputStream fout=new FileOutputStream("D:\\Wiley_practice_git\\data\\data4.txt");
        DataOutputStream dos=new  DataOutputStream(fout);
        dos.writeBytes(s.name+" "+s.gender+" "+s.grade);
        dos.close();
        fout.close();

	}

}
