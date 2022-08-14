package ch22;

class Bank{
	
	private int money = 10000;
	
	// synchronized 하면 Thread 하나가 동작중이면 다른거 동작 못함
	// # 타입 1
	public synchronized void saveMoney(int save){  // synchronized 사용하여 동기화
		
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney( m + save);
	}
	
	// # 타입 2
	public void minusMoney(int minus){
		
		synchronized(this) {
			int m = this.getMoney();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney( m - minus);
			
		}
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
}

class Park extends Thread{
	
	public  void run(){
		
		// # 1
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney() );	
		
		// # 2 위에서 동기화 안하면
//		synchronized(SyncMain.myBank) {   // 어떤 리소스에 SYNC를 걸건지 적어줘야함
//		System.out.println("start save");
//		SyncMain.myBank.saveMoney(3000);
//		System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney() );	
//		}
	}
}

class ParkWife extends Thread{
	
	public void run(){
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney() );
		
	}
	
}

public class SyncMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
	}

}