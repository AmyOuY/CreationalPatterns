package abstractFactoryPattern;

public class AbstractFactoryProducer {
	
	public static AbstractFactory getSound(boolean isFemale) {
		if (isFemale) {
			return new FemaleSoundAbstractFactory();
		}
		else {
			return new SoundAbstractFactory();
		}
	}

}
