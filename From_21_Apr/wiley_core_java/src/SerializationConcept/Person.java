package SerializationConcept;

import java.io.Serializable;

public class Person  implements Serializable{
  private static final long serialversionUID= 1L;
  int roll;
  String fname;
  String lname;
  public Person(int roll, String name, String lname) {
	  super();
	  this.roll=roll;
	  this.fname=name;
	  this.lname=lname;
  }
	

}
