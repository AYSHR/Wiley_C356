package mavenexample;

import java.util.Scanner;

public class consoleapp {
  
	
	public static void main(String[] args) {
		EmployeeImpl imp = new EmployeeImpl();
		
		Scanner sc = new Scanner(System.in);
		int count = -1;
		while (count != 0) {
			System.out.println("enter your choice:\n" + "1. add employee\n" + "2. show all employees\n"
					+ "3. update employee\n" + "4. delete data\n" + "0. exit");
			count = sc.nextInt();
			switch (count) {
			case 1:
				Employee emp = new Employee();
				System.out.println("enter id:");
				emp.setId(sc.nextInt());
				System.out.println("enter name:");
				emp.setName(sc.next());
				System.out.println("enter salary:");
				emp.setSalary(sc.nextDouble());
				System.out.println("enter age:");
				emp.setAge(sc.nextInt());
				imp.createEmployee(emp);
				break;
			case 2:
				imp.getallEmp();
				break;
			case 3:
				System.out.println("enter id to update data:");
				int id1 = sc.nextInt();
				System.out.println("enter name to update data:");
				String name1 = sc.next();
				imp.updatename(id1, name1);
				break;
			case 4:
				System.out.println("enter id to delete data:");
				imp.deleterecord(sc.nextInt());
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
		sc.close();
	}
}
