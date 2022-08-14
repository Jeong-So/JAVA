package ch08;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}



public class AnimalTest {
	
//	ArrayList<Animal> aniList = new ArrayList<>(); 

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> aniList = new ArrayList<>(); 
		aniList.add(hAnimal);
		aniList.add(tAnimal);
		aniList.add(eAnimal);
		
		for(Animal animal : aniList) {
			animal.move();
		}
		
		test.testDownCasting(aniList);
		
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0; i<list.size();i++) {
			
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				
				Human human = (Human)animal;
				human.readBook();
				
			}
			else if(animal instanceof Tiger) {
				
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			}
			else if(animal instanceof Eagle) {
				
				Eagle eagle = (Eagle)animal;
				eagle.flying();
				
			}
			else {
				System.out.println("unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		System.out.println("==================");
	}
	
	
}
