package prototypePattern;

public class PrototypePatternMain {

	public static void main(String[] args) {
		AnimalCache.loadAnimalCache();
		
		Animal dog = AnimalCache.getCloneNewAnimal(1);
		System.out.println(dog);
		
		Animal cat = AnimalCache.getCloneNewAnimal(2);
		System.out.println(cat);
		
		Animal bird = AnimalCache.getCloneNewAnimal(3);
		System.out.println(bird);
		
		Animal dog2 = AnimalCache.getCloneNewAnimal(1);
		System.out.println(dog2);		
		
	}
}
