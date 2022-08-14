package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
		// public Person(String name, int age) ������ ȣ���Ͽ� �ʱ�ȭ �� this ���
		// �̰� �տ��� �ٸ� ���� �� �� ����
		this("no name", 1);
		
//		// case 1 �̸�, ���� �ʱ�ȭ
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
	
	
	public Person getPerson() {   //��ȯŸ���� class Person
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
