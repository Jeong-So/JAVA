package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c = Class.forName("java.lang.String");
		
		// 모든 생성자 가져오기
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		System.out.println();
		
		// 모든 멤버변수 가져오기
		Field[] fields = c.getFields();
		for(Field fld : fields) {
			System.out.println(fld);
		}
		
		System.out.println();
		
		// 모든 메서드 가져오기
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
		
		
	}

}
