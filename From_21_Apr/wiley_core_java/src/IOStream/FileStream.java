package IOStream;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileStream {

	public static void main(String[] args) throws IOException {
/*	FileOutputStream  fout=new FileOutputStream("D:\\\\Wiley_practice_git\\\\data\\\\first.txt");
  String str="example 1";
  byte[] b=str.getBytes();
  fout.write(b); */
		FileInputStream fin=new FileInputStream("D:\\Wiley_practice_git\\data\\first.txt");
		int i;
	     try {
	    	 while((i=fin.read())!=-1) {
	        	 System.out.println((char)i);
	         }
	         
	         fin.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
