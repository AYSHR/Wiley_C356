package collection;

import java.util.Objects;

public class GeniusStudent implements Comparable<GeniusStudent> {
  
	private int id;
	private String name;
	private int salary;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public GeniusStudent(int id,String name,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeniusStudent other = (GeniusStudent) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	 public void setId(int id) { this.id = id; }
	 public void setName(String name) { this.name = name; }
	 public int getId() { return id; } public String getName() { return name; }
	@Override
	public String toString() {
		return "GeniusStudent [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(GeniusStudent o) {
		if(id==o.id) {
		return 0;
	}else if(id>o.id) {
		return 1;
	}else {
		return -1;
	}
	} 
	
}
