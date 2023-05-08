package datastruc;

public class queueclass {
 int size=5;
int arr[]=new int[size];
int front;
int rear;

public queueclass() {
	front=-1;
	rear=-1;
}

//overflow
public boolean isFull() {
	return (front==0 && rear==size-1);
}

//underflow
public boolean isEmpty() {
	return (front==-1);
}

//insertion
public void enqueue(int x) {
	if(isFull()) {
		System.out.println("queue is full");
		
	}
	else {
		rear++;
		arr[rear]=x;
		if(rear==-1) {
			rear++;
		}
		System.out.println("inserted "+ x);
	}
}

//deletion
public void dequeue() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		
	}
	else {
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else {
			System.out.println("deleted"+ arr[front]);
			front++;
		}
	}
}

//printing elements
public void printele() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		return;
	}
	System.out.println(front);
	for(int i=front;i<=rear;i++) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		queueclass q=new queueclass();
		q.dequeue();
		for(int i=1;i<=5;i++) {
			q.enqueue(i);
		}
		q.printele();
		q.dequeue();
		q.printele();
	}

}
