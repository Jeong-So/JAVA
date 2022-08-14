package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
		// public Person(String name, int age) 생성자 호출하여 초기화 시 this 사용
		// 이거 앞에는 다른 내용 올 수 없음
		this("no name", 1);
		
//		// case 1 이름, 나이 초기화
//		this.name = "no name";
//		this.age = 1;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void showPerson() {
		System.out.println(name+", "+age);
	}
	
	
	public Person getPerson() {   //반환타입은 class Person
		return this;
	}
	
	public void showThis() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
//		Person person2 = person.getPerson();
		System.out.println(person.getPerson());
		person.showThis();
	}

}
