package lambada;

import java.util.HashMap;
import java.util.function.Function;
import java.util.*;

public class BuiltInFunction {

	private static HashMap<Integer, String> Employee = new HashMap<>();
	
	public static void add(String name, int ID) {
		if(!Employee.containsKey(ID)) {
			Employee.put(ID, name);
		}else 
			System.out.println("Employee already exist");
	}
	
	public static void main(String[] args) {
		//Function 
		Function<Integer, String> get = (Integer ID) -> {
			if(Employee.containsKey(ID)) return Employee.get(ID);
			else {
				return "Invalid ID";}
		};
		
		add("one", 101);
		add("upon", 102);
		add("apple", 103);
		add("time", 104);
		add("dog", 105);
		
		System.out.println("ID = 103, Name= "+ get.apply(103));
		
	}
}