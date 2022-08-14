package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student James = new Student("James", 10000);
		Student Tomas = new Student("Tomas", 13000);
		Student Edward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Subway greensubway = new Subway(200);
		Texi Texi = new Texi("잘나간다 운수");
		
		James.takeBus(bus100);
		Tomas.takeSubway(greensubway);
		Edward.takeTaxi(Texi);
		
		James.showInfo();
		Tomas.showInfo();
		Edward.showInfo();
		
		bus100.showBusInfo();
		greensubway.showSubwayInfo();
		Texi.showTexiInfo();
		
	}

}
