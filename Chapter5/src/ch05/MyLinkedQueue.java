package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue {
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

	MyListNode front;
	MyListNode rear;
	
	@Override
	public void enQueue(String data) {
		// TODO Auto-generated method stub
		
		MyListNode newNode;
		if (isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return null;
		}
		
		String data = front.getData();
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
		return data;
	}

	@Override
	public void printQueue() {
		// TODO Auto-generated method stub
		
		printAll();
		
	}


}
