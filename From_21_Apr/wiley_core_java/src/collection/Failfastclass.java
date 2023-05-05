package collection;

import java.util.List;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Failfastclass {

	public static void main(String[] args) {
	//	List<String> list=new ArrayList();
		List<String> list=new CopyOnWriteArrayList();
		list.add("a");
		list.add("a");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add("c");
		}
System.out.println(list);
	}

}
