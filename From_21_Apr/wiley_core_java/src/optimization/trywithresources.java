package optimization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//try with resources is actually try-catch that is java-7 feature it ensures the memory leak operation
//closes streams and files which aren't closed

public class trywithresources {

	public static void main(String[] args) {

		// inefficient w/o try with resources
		/*
		 * FileInputStream fis; try{ fis=new FileInputStream("sample.txt"); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); }finally { try {
		 * if(fis!=null) { fis.close(); } }catch (IOException e) { e.printStackTrace();
		 * } }
		 */

		// efficient way to prevent memory leak is try with resources(java-7) feature
		try (FileInputStream fis = new FileInputStream("sample.txt")) {

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
