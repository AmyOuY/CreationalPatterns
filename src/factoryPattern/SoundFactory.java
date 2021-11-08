package factoryPattern;

public class SoundFactory {

	public Sound getSound(String typeOfAnimal) {
		if (typeOfAnimal == null) {
			return null;
		}
		if (typeOfAnimal.equalsIgnoreCase("Dog")) {
			return new Dog();
		}else if (typeOfAnimal.equalsIgnoreCase("Cat")) {
			return new Cat();
		}else if (typeOfAnimal.equalsIgnoreCase("Bird")){
			return new Bird();
		}
		return null;
	}
}
