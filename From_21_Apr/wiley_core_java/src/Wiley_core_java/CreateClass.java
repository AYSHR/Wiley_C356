package Wiley_core_java;

public class CreateClass implements Cloneable {

	int a = 10;

	public void add() {
		System.out.println("number added");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		// Create object with new keyword
		CreateClass cc = new CreateClass();
		cc.add();
		System.out.println(cc);

		// cREATE OBJECT WITH newInstance
		try {
			Class c = Class.forName("Wiley_core_java.CreateClass");
			// from java 9 newinstance() is depricated
			// fully qualified name of class- packagename.classname
			CreateClass ci = (CreateClass) c.newInstance();
			ci.add();
			System.out.println(cc);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// if we create obj using assign operator then it will be point to same address
		// creating obj using cloneable interface by clone
		CreateClass obj = (CreateClass) cc.clone();
		obj.add();
		System.out.print(" obj clone: " + obj);
	// java obj can be created using serialization and deserialization
	}
}
