package ch08;

public class Person {
	
	public String name;
	public int height;
	public int weight;
	public String gender;
	public int age;
	
	public Person(String name, int height, int weight, String gender, int age) { 
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.age = age;
	}
	
	public String PersonInfo() {
		return "Ű�� "+ height + " �̰� �����԰� " + weight + "ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + " �̰� ���̴� "+ age + "�� �Դϴ�.";
	}

}
