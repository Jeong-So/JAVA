package ch20;

// Runnable 인터페이스 구현하여 만들기
class MyThread2 implements Runnable{  // Runnable : Thread화 할 수 있는 인터페이스

	public void run(){
		
		int i;
		for(i=0; i<200; i++){
			
			System.out.print(i + "\t");
	
			
		}
	}
}


public class ThreadTest2 {

	public static void main(String[] args) {

		
		// # 1
		System.out.println(Thread.currentThread() + "start");
		
		MyThread2 runnable = new MyThread2();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(new MyThread2());
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
		
		// # 2
		Runnable run = new Runnable() {  // 이것도 하나의 Thread가 되어 수행됨

			@Override
			public void run() {

				System.out.println("run");
				
			}
			
		};
		run.run();
		
		
	}

}