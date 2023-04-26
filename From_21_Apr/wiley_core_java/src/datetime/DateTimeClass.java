package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		//current date
		LocalDate mydate=LocalDate.now();
		System.out.println(mydate);
		//current timee
				LocalTime mytime=LocalTime.now();
				System.out.println(mytime);
				//current date
				LocalDateTime mydatetime=LocalDateTime.now();
				System.out.println(mydatetime);
				System.out.println("before formatting"+ mydatetime);	
DateTimeFormatter mydateformat=DateTimeFormatter.ofPattern("dd--MM--yyyy hh:mm:ss");
	   String mydat=mydatetime.format(mydateformat);
				System.out.println("after fdormatting"+mydat);	
	String datestr="26/04/2023";
	DateTimeFormatter strformat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date=LocalDate.parse(datestr,strformat);
	System.out.println(date);
	
	
	}

}
