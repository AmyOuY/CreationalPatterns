package abstractFactoryPattern;

public class FemaleSoundAbstractFactory extends AbstractFactory{

	public Sound getSound(String typeOfAnimal) {
		if (typeOfAnimal == null) {
			return null;
		}
		if (typeOfAnimal.equalsIgnoreCase("Dog")) {
			return new FemaleDog();
		}else if (typeOfAnimal.equalsIgnoreCase("Cat")) {
			return new FemaleCat();
		}else if (typeOfAnimal.equalsIgnoreCase("Bird")) {
			return new FemaleBird();
		}
		return null;
	}
}
