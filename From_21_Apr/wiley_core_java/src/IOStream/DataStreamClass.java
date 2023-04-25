package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
	/*	FileOutputStream fout=new FileOutputStream("D:\\Wiley_practice_git\\data\\data2.txt");
		DataOutputStream dos=new DataOutputStream(fout);
	dos.writeBytes("am a programmer");
	dos.flush();
	dos.close();
	 */
		FileInputStream fin=new FileInputStream("D:\\Wiley_practice_git\\data\\data2.txt");
		DataInputStream dis=new DataInputStream(fin);
		 int count=fin.available();
		 byte[] ba=new byte[count];
		 dis.read(ba);
		 for(byte b : ba) {
			 System.out.println((char)b);
		 }
		 dis.close();
		 fin.close();
		
		
	}
}
