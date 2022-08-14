package ch10;

public class BirthdayTest {

	public static void main(String[] args) {

		Birthday date = new Birthday();
		
		date.setYear(2022);
		date.setMonth(4);
		date.setDay(12);
		
		date.showDate();
		
		boolean isValid = date.getisValid();
		System.out.println(isValid);
	}

}
