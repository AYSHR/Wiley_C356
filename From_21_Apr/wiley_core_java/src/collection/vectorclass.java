package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class vectorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Vector<String> vc=new Vector<>();
  vc.addElement("a");
  vc.addElement("b");
  vc.addElement("c");
  vc.addElement("d");
  Enumeration<String> ev=vc.elements();
  while(ev.hasMoreElements()) {
	  System.out.println(ev.nextElement());
  }
  Iterator<String> itr=vc.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
  System.out.println("ll forward :");
  LinkedList<String> list=new LinkedList<>();
  list.add("1");
  list.add("2");
  list.add("3");
  list.add("4");
  ListIterator<String> front=list.listIterator();
  ListIterator<String> back=list.listIterator(list.size());
  while(front.hasNext()) {
	  System.out.println(front.next());
  }
  System.out.println(" ll backward: ");
  while(back.hasPrevious()) {
	  System.out.println(back.previous());
  }
  
  System.out.println("arraylist traversal ");
  List<String> ar=new ArrayList<>();
  ar.add("a");
  ar.add("b");
  ar.add("c");
  ar.add("d");
  ListIterator<String> aritr=ar.listIterator();
  while(aritr.hasNext()) {
	  System.out.println(aritr.next());
  }
	}
	
}
