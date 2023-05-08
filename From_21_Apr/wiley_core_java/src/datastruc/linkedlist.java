package datastruc;

public class linkedlist {
  static Node head;
 
   static class Node{
	   int data;
	   Node next;
	   Node(int x){
		   this.data=x;
		   this.next=null;
	   }
  }
   
   public static void insertback(int x) {
	  Node tmp= new Node(x);
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
	  
	   System.out.println("inserted "+x);
   }
   
   public static void insertfront(int x) {
	   Node tmp=new Node(x);
	  Node p=head;
	  head=tmp;
	  tmp.next=p;
	  System.out.println("inserted in front");
   }
   
   public static void insertmid(int x,int pos) {
	   Node tmp=new Node(x);
	  Node p=head;
	  while(p.next!=null) {
		  if(pos==0) {
			 break;
		  }
		 -- pos;
		  p=p.next;
	  }
	  Node end=p.next;
	  p.next=tmp;
	  p.next.next=end;
   }
   
   
   public static void delend() {
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
   
   public static void delfront() {
	   if(head==null) {
		   System.out.println("list empty");
	   }else {
		 head=head.next;
	   }
   }
   
   public static void delmid(int pos) {
	   if(head==null) {
		   System.out.println("list empty");
		   return;
	   }
	  Node p=head;
	  while(p.next!=null) {
		  if(pos==0) {
			 break;
		  }
		 -- pos;
		  p=p.next;
	  }
	  p.next=p.next.next;
	System.out.println("deleted in b/w");
   }
   
   public static  void search(int key) {
	   if(head==null) {
		   System.out.println("list empty, can't find value");
		   return;
	   }
	   else {
		   Node p=head;
		   while(p!=null) {
			   if(p.data==key) {
				   System.out.println("found element ");
				   break;
			   }
			   p=p.next;
		   }
	   }
   }
   
   public static void display() {
	   if(head==null) {
		   System.out.println("empty list");
	   }else {
		   Node p=head;
		   while(p!=null) {
			   System.out.print(p.data+" ");
			   p=p.next;
		   }
	   }
   }
   
   public static void sortlist() {
	   Node curr=head;
	   Node index=null;
	   int temp;
	   while(curr!=null) {
		   index=curr.next;
		   while(index!=null) {
			   if(curr.data > index.data) {
				   temp=index.data;
				   index.data=curr.data;
				   curr.data=temp;
			   }
			   index=index.next;
		   }
		   curr=curr.next;
	   }
   }
	public static void main(String[] args) {
	//	linkedlist list=new linkedlist();
		/*
		 * list.head=new Node(1); Node sec=new Node(2); Node third =new Node(3);
		 * 
		 * 
		 * list.head.next=sec; sec.next=third;
		 */
		for(int i=2;i<=10;i++) {
			insertback(i);
		}
		display();
		System.out.println();
		insertfront(1);
		display();
		System.out.println();
		insertmid(11,4);
		display();
		System.out.println();
		
		search(2);
		
		delend();
		display();
		System.out.println();
		
		delfront();
		display();
		System.out.println();
		
		delmid(2);
		display();
		System.out.println();
		
		
		
		display();
		System.out.println();
		sortlist();
		System.out.println("sorted list :");
		display();
		System.out.println();
		
	}

}
