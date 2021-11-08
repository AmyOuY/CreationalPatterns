package singletonPattern;

public class SingletonClass {
	
	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	// Get the only available object
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	
	public void method() {
		System.out.println("Hashcode of singleton object " + singletonInstance);
	}

}
