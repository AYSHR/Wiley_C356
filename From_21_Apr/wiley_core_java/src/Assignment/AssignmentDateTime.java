package Assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AssignmentDateTime {

	public static void main(String[] args) {
		LocalDate mydate=LocalDate.now();
		DateTimeFormatter mydateformat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	System.out.println("before formatting:"+mydate);
	 String mydat=mydate.format(mydateformat);
	 System.out.println("after formatting as yyyy-mm-dd:"+mydat);
	 DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 String mydat2=mydate.format(format2);
	 System.out.println("after formatting as dd/mm/yyyy:"+mydat2);
	 DateTimeFormatter format3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	 String mydat3=mydate.format(format3);
	 System.out.println("after formatting as dd-MMM-yyyy:"+mydat3);
	 DateTimeFormatter format4=DateTimeFormatter.ofPattern("E, dd MMM yyyy");
	 String mydat4=mydate.format(format4);
	 System.out.println("after formatting as E, dd MMM yyyy:"+mydat4);
	}

}
