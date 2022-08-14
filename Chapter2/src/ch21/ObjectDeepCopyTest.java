package ch21;

public class ObjectDeepCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���","������");
		library[1] = new Book("���̾�","�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�","���ù�");
		library[3] = new Book("����","�ڰ渮");
		library[4] = new Book("�����","�������丮");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();

		
		for(int i=0; i<library.length;i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		
		System.out.println("\n == Library ==");
		for(Book book: library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("\n == copyLibrary ==");
		for(Book book: copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		
		System.out.println("\n == Library ==");
		for(Book book: library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("\n == copyLibrary ==");
		for(Book book: copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
