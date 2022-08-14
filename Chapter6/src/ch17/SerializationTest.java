package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person implements Externalizable{  // Externalizable 인터페이스 메서드 직접 구현 필요
	
	String name;
	String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		//obj.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		//job = obj.readUTF();
	}
	
}

// # 2
//class Person implements Serializable{
//	
//	private static final long serialVersionUID = -1503252402544036183L;
//
//	String name;
//	String job;
//	
//	
//	public Person() {}
//
//	public Person(String name, String job) {
//		this.name = name;
//		this.job = job;
//	}
//	
//	public String toString()
//	{
//		return name + "," + job;
//	}
//}


public class SerializationTest {

	public static void main(String[] args) {

		Person personAhn = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		try(FileInputStream fis = new FileInputStream("serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		}catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}