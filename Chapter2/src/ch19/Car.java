package ch19;

public class Car {
	
	private static int serialNum = 1000; 
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() { 
		return carNum;
	
	}
}
