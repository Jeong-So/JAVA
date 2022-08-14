package ch10;

public class CarTest {

	public static void main(String[] args) {
		
		Car AICar = new AiCar();
		AICar.run();
		
		System.out.println("=============");
		
		Car MCar = new ManualCar();
		MCar.run();

	}

}
