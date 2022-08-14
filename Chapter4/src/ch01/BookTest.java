package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + "," + author;
		// return super.toString();
	}  

	
	
}


public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("데미안", "헤르만 헤세");
		
		System.out.println(book);
		System.out.println(book.toString());
		
		String str = new String("test");
		System.out.println(str); // String과 Integer 클래스는 toString() 메서드 미리 재정의
		System.out.println(str.toString());
	}

}
