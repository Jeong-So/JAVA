package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("데미안","헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생택쥐페리");
		

		System.arraycopy(library, 0, copyLibrary, 0, 5);  // 주소만 복사
		
		System.out.println("== Library ==");
		for(Book book: library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copyLibrary ==");
		for(Book book: copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
//		System.out.println("== Library ==");
//		for(Book book: library) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		System.out.println("== copyLibrary ==");
		for(Book book: copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		//얕은 복사
		
	}
	
}
