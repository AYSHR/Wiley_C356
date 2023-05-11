package Assignment;


public class Studentlist {
	static Node head;
	static class Node{
		int roll;
		String name;
		Node next;
		Node(int roll, String name){
			this.roll=roll;
			this.name=name;
			next=null;
		}
	}
	
	
	 public static void insert(int roll,String name) {
		  Node tmp= new Node(roll,name);
		   if(head==null) {
			  head=tmp;
		   }
		   else {
			   Node p=head;
			   while(p.next!=null) {
				   p=p.next;
			   }
			   p.next=tmp;
		   }
		  
		   System.out.println("inserted "+roll+" : "+name+" 's data");
	   }
	 
	 public static  void search(int roll, String name) {
		   if(head==null) {
			   System.out.println("list empty, can't find value");
			   return;
		   }
		   else {
			   Node p=head;
			   while(p!=null) {
				   if(p.roll==roll && p.name==name) {
					   System.out.println("found data of "+name+" whose roll.no. is : "+roll);
					   break;
				   }
				   p=p.next;
			   }
		   }
	   }
	 public static void delete() {
		   if(head==null) {
			   System.out.println("list empty");
		   }else {
			   Node p=head;
			   while(p.next.next!=null) {
				   p=p.next;
			   }
			   p.next=null;
		   }
	   }

	 public static void display() {
		   if(head==null) {
			   System.out.println("empty list");
		   }else {
			   Node p=head;
			   while(p!=null) {
				   System.out.println(p.roll+" : "+p.name);
				   p=p.next;
			   }
		   }
	   }
	public static void main(String[] args) {
		insert(1,"harry");
		insert(2,"marie");
		insert(3,"henry");
		insert(4,"gilbert");
		insert(5,"honey");
		display();
		System.out.println("is harry data is present ?");
		search(1,"harry");
		delete();
		System.out.println("after deleting last person data:");
		display();
		
	
	}

}
