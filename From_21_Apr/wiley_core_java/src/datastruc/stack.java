package datastruc;

public class stack {
 private int arr[];
 private int top;
 private int capacity;
 
 
	public stack( int size) {
	arr=new int[size];
top = -1;
	capacity = size;
}

public boolean isEmpty() {
	return top==-1;
}

public boolean isFull() {
	return top==capacity-1;
}

public void push(int x) {
	if(isFull()) {
		System.out.println("overflow");
	}
	arr[++top]=x;
	System.out.println("inserted "+ x);
}

public int pop() {
	if(isEmpty()){
		System.out.println("underflow");
		System.exit(1);
	}
	return arr[top--];
}

public void printstack() {
	for(int i=0;i<=top;i++) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
	  stack mystack=new stack(5);
	  for(int i=1;i<=5;i++) {
		  mystack.push(i);
	  }
	  mystack.printstack();
	  mystack.pop();
	
	  mystack.printstack();
	  
	}

}
