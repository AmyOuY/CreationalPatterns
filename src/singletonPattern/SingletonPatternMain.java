package singletonPattern;

public class SingletonPatternMain {

	public static void main(String[] args) {
		SingletonClass singletonObject = SingletonClass.getInstance();
		singletonObject.method();
		
		SingletonClass singletonObject2 = SingletonClass.getInstance();
		singletonObject2.method();
	}
}
