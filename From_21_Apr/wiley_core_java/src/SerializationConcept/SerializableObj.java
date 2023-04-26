package SerializationConcept;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {

	public static void main(String[] args) {
		Person p1=new Person(101,"harry","potter");
		try( // we can passa s args
				FileOutputStream fos=new FileOutputStream("person.ser");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				) {
			
			oos.writeObject(p1);
			fos.close();
			System.out.println("task completed");
		}catch (Exception e) {
			
			e.printStackTrace();// TODO: handle exception
		}

	}

}
