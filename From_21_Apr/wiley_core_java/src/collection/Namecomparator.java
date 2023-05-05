package collection;

import java.util.Comparator;

public class Namecomparator implements Comparator<GeniusStudent> {
	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		if(o1.getName()==o2.getName()) {
			return 1;
		} /*
			 * else if(o1.getName() > o2.getName()) { return 1; }
			 */else {
			return -1;
		}
	}
}
