package ch01;


class Outer2{
	
	int outNum = 100;  // 인스턴스 변수
	static int sNum = 200;  // 정적(스태틱) 변수
		
	Runnable getRunnable(int i){  // 매개변수 i 스택메모리에 생성됨 (지역변수)
		/* 
		 * Runnable 인터페이스 : 클래스를 스레드와할 때 사용하는 필요한 Run 메소드를 구현할 때 사용하는 인터페이스
		 * 클래스를 스레드로 만들때 2가지 방법 있음
		 * 1번째: 스레드 클래스에서 상속을 받는방법
		 * 2번째: Runnable 인터페이스를 임플리멘트 하는 방법
		 */
		
		int num = 10; // 지역변수 num 스택메모리에 생성됨
		
		// # 1
		// 지역 내부클래스의 변수사용개념
//		class MyRunnable implements Runnable{  // localInnerClass
//
//			int localNum = 1000;  // 멤버변수
//			
//			@Override
//			public void run() {
//				
//				/*
//				i = 50;  // 오류남 : getRunnable 메서드 호출시점과 MyRunnable class 생성주기가 달라서 그럼
//				num = 20;  // 메서드 호출이 끝나고나면 지역변수들 없어짐, run이라는 메서드는 getRunnable 메서드 호출 후에도 재 호출 가능, 
//							// run 메서드가 또 호출 되었을 때 i, num이 없어서 어사인을 못해줌  --> 따라서 final로 지정해야함
//				// 지금은 final로 지정하지 않아도 컴파일러가 직접 final로 지정 따라서 값을 바꿀 수 없음
//				*/
//				
//				System.out.println("i =" + i);
//				System.out.println("num = " + num);
//				System.out.println("localNum = " + localNum);
//				
//				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
//				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
//				
//			}
//			
//		}
//		return new MyRunnable();   // MyRunnable() 클래스 이름 쓰는 때가 21행, 45행 밖에없음+ 다른데서 쓸일 없음 --> 이름 없앰 (아래와 같음
		
		// # 2
		// 익명 내부 클래스
		return new Runnable(){  // localInnerClass

			int localNum = 1000;  // 멤버변수
			
			@Override
			public void run() {
				
				/*
				i = 50;  // 오류남 : getRunnable 메서드 호출시점과 MyRunnable class 생성주기가 달라서 그럼
				num = 20;  // 메서드 호출이 끝나고나면 지역변수들 없어짐, run이라는 메서드는 getRunnable 메서드 호출 후에도 재 호출 가능, 
							// run 메서드가 또 호출 되었을 때 i, num이 없어서 어사인을 못해줌  --> 따라서 final로 지정해야함
				// 지금은 final로 지정하지 않아도 컴파일러가 직접 final로 지정 따라서 값을 바꿀 수 없음
				*/
				
				System.out.println("i =" + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
				
			}
			
		};   // MyRunnable() 클래스 이름 쓰는 때가 21행, 45행 밖에없음 + 다른데서 쓸일 없음 --> 이름 없앰		
	}
	
	// # 3 익명 내부 클래스
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Runnable class");
					
				}
			};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
	
		Runnable runner = out.getRunnable(100);  // getRunnable이 호출 후 끝남
		
		runner.run(); // run은 따로 후출 가능
		
		out.runnable.run();
	}
}


