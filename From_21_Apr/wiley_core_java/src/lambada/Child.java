package lambada;
@FunctionalInterface
public interface Child extends parent {
	
	//can override parent function
	public  void sayHello();
	
	//can have default methods
	 default void sayHi() { }
	 
	//can have methods of object class
	String toString();
	int hashCode();
	boolean equals(Object on);
	
}

