package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���","������");
		library[1] = new Book("���̾�","�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�","���ù�");
		library[3] = new Book("����","�ڰ渮");
		library[4] = new Book("�����","�������丮");
		

		System.arraycopy(library, 0, copyLibrary, 0, 5);  // �ּҸ� ����
		
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
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		
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
		
		//���� ����
		
	}
	
}
