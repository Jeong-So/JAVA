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
		return "키가 "+ height + " 이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다. 이름은 " + name + " 이고 나이는 "+ age + "세 입니다.";
	}

}
