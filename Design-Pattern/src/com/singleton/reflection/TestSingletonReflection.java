package com.singleton.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingletonReflection {

	public static void main(String[] args) throws InstantiationException,IllegalAccessException, 
												  IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		SingletonReflection s1 = SingletonReflection.getInstance();
		SingletonReflection s2 = null;
		
		Constructor<?>[] constructors = SingletonReflection.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			
			Object object = constructor.newInstance();
			s2 = (SingletonReflection) object;
			break;
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
	

}
