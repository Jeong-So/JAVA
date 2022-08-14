package ch05;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		
		listQueue.printAll();
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
	}

}
