package factoryPattern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		SoundFactory soundFactory = new SoundFactory();
		
		Sound cat = soundFactory.getSound("cat");
		cat.sound();
		
		Sound dog = soundFactory.getSound("dog");
		dog.sound();
		
		Sound bird = soundFactory.getSound("bird");
		bird.sound();
	}
}
