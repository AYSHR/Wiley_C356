package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	public int id;
	public String name;
	public int problem_solved;
	public String grade;
	public Student(int id, String name, int problem_solved, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.problem_solved = problem_solved;
		this.grade = grade;
	}
	
}
public class StudentStream {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"rose",20,"B"));
		list.add(new Student(2,"harry",23,"A"));
		list.add(new Student(3,"marie",25,"A"));
		list.add(new Student(4,"curie",19,"B"));
		list.add(new Student(5,"bella",24,"A"));
		list.add(new Student(6,"gilbert",17,"B"));
		list.add(new Student(7,"hency",23,"A"));
		list.add(new Student(8,"sam",24,"A"));
		list.add(new Student(9,"elena",18,"B"));
		
		//printing initial values
		System.out.println("before applying streams method: ");
		Iterator<Student> itr1=list.listIterator();
			while(itr1.hasNext()) {
				Student s=itr1.next();
				System.out.printf("%-2d %s %-10s %s %-3d %s %-1s ",s.id ," ",s.name," ",s.problem_solved," ",s.grade);
				System.out.println();
			}
			
			//applying transformation
		List<Student> filterdData = 
				list.stream()
					.filter( student -> student.problem_solved > 16 )
					.map(student -> new Student(student.id, student.name, student.problem_solved, student.grade + "++"))
					.sorted((s1,s2)-> s2.grade.compareTo(s1.grade))
					.limit(5)
					.collect(Collectors.toList());
		
		
		//printing final values
		System.out.println("*********************");
		Iterator<Student> itr=filterdData.listIterator();
		System.out.println("after applying streams method: ");
	//	System.out.println(filterdData);
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.printf("%-2d %s %-10s %s %-3d %s %-1s ",s.id ," ",s.name," ",s.problem_solved," ",s.grade);
			System.out.println();
		}
	}

}
