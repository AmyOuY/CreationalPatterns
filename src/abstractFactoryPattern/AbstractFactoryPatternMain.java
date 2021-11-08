package abstractFactoryPattern;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getSound(true);
		
		Sound cat = abstractFactory.getSound("cat");
		cat.sound();
		
		Sound dog = abstractFactory.getSound("dog");
		dog.sound();
		
		Sound bird = abstractFactory.getSound("bird");
		bird.sound();
	}
}
