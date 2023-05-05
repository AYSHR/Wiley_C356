package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArraylist extends ArrayList {

	/*
	 * public boolean add(Object o){ if(this.contains(o)) { return true; }else {
	 * return super.add(o); }}
	 */

	public static void main(String[] args) {
		/*
		 * CustomArraylist cl=new CustomArraylist(); cl.add(1); cl.add(2); cl.add(1);
		 * cl.add(3); cl.add(3); //it ll store only unique val System.out.println(cl);
		 */

		// Set<GeniusStudent> setstudent = new HashSet<>();
		List<GeniusStudent> setstudent = new ArrayList();
		GeniusStudent gst1 = new GeniusStudent(101, "harry",456);
		GeniusStudent gst2 = new GeniusStudent(105, "hay",982);
		GeniusStudent gst3 = new GeniusStudent(108, "rose",543);
		GeniusStudent gst4 = new GeniusStudent(108, "ro",434);
		setstudent.add(gst3);
		setstudent.add(gst2);
		setstudent.add(gst1);
		setstudent.add(gst4);
		Collections.sort(setstudent,new Idcomparator());
		System.out.println(setstudent);
	}

}
