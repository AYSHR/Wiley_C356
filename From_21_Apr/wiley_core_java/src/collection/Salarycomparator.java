package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Salarycomparator implements Comparator<GeniusStudent> {

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		if(o1.getSalary()==o2.getSalary()) {
			return 1;
		}else if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}else {
			return -1;
		}
	}
     public static void main(String[] args) {
    	 List<GeniusStudent> al = new ArrayList();
    	 GeniusStudent gst1 = new GeniusStudent(101, "harry",400);
 		GeniusStudent gst2 = new GeniusStudent(105, "hay",345);
 		GeniusStudent gst3 = new GeniusStudent(103, "rose",675);
 		GeniusStudent gst4 = new GeniusStudent(108, "ro",987);
	al.add(gst4);
	al.add(gst3);
	al.add(gst2);
	al.add(gst1);
     Collections.sort(al,new Salarycomparator());
     System.out.println(al);
     }
}
