package SerializationConcept;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableObj {

	public static void main(String[] args) {
				try {
					FileInputStream fis = new FileInputStream("person.ser");
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					Person p = (Person) ois.readObject();
					System.out.println("Roll: "+ p.roll);
					System.out.println("First name: "+ p.fname);
					System.out.println("Last name: "+ p.lname);
					
					ois.close();
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	
