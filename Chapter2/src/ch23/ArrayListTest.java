package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산백","조정래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가","유시민"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생텍쥐페리"));
	
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
