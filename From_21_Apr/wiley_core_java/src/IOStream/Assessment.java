package IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assessment {
	private String name;
	private boolean gender; // true: male, false: female
	private int age;
	public Assessment(String n, boolean i, int a) {
		this.name=n;
		this.age=a;
		this.gender=i;
	}
	public String getname() {
		return name;
	}
	public boolean getgen() {
		return gender;
	}
	public int getage() {
		return age;
	}
	public static void main(String[] args) throws IOException {
		Assessment a=new Assessment("harry",false,12);
		Assessment a1=new Assessment("rose",true,10);
		FileOutputStream fout=new FileOutputStream("D:\\Wiley_practice_git\\data\\assess.txt");
		DataOutputStream dos=new DataOutputStream(fout);
		dos.writeUTF(a.getname());
		dos.writeBoolean(a.getgen());
		dos.writeInt(a1.getage());
		dos.writeUTF(a1.getname());
		dos.writeBoolean(a1.getgen());
		dos.writeInt(a1.getage());
		dos.close();
		fout.close();
		

	}

}
