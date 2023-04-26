package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterStreamClass {

	public static void main(String[] args) throws IOException {
	/*	 Writer out= new OutputStreamWriter(System.out);
		 Writer fw=new FileWriter("D:\\Wiley_practice_git\\data\\data3.txt");
		 BufferedWriter bw=new BufferedWriter(fw);
		 bw.write("i like propgramming");
		 bw.flush();
		 bw.close();
		 fw.close(); */
		Reader out= new InputStreamReader(System.in);
		Reader fw=new FileReader("D:\\Wiley_practice_git\\data\\data3.txt");
		 BufferedReader bw=new BufferedReader(fw);
		 int i=0;
		 try {
	    	 while((i=bw.read())!=-1) {
	        	 System.out.println((char)i);
	         }
	 
			 bw.close();
			 fw.close(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		 

	}

}
