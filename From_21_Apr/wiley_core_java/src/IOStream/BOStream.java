package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BOStream {
public static void main(String[] args) throws IOException {
/*	FileOutputStream fout=new FileOutputStream("D:\\Wiley_practice_git\\data\\data1.txt");
	BufferedOutputStream bof=new BufferedOutputStream(fout);
	String str="i am a programmer";
	byte[] b=str.getBytes();
	try {
		bof.write(b);
		//if we don't use flush and close op will not be printed
		bof.flush();
		bof.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	*/
	FileInputStream fis=new FileInputStream("D:\\Wiley_practice_git\\data\\data1.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
     int i;
     try {
    	 while((i=bis.read())!=-1) {
        	 System.out.println((char)i);
         }
         bis.close();
         fis.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
     
}
}
