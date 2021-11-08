package prototypePattern;

import java.util.Hashtable;

public class AnimalCache {

	private static Hashtable<Integer, Animal> animalMap = new Hashtable<Integer, Animal>();
	
	public static Animal getCloneNewAnimal(int id) {
		Animal cachedAnimalInstance = animalMap.get(id);
		return (Animal)cachedAnimalInstance.cloningMethod();
	}
	
	
	public static void loadAnimalCache() {
		Dog dog = new Dog();
		dog.id = 1;
		animalMap.put(dog.id, dog);
		
		
		Cat cat = new Cat();
		cat.id = 2;
		animalMap.put(cat.id, cat);
		
		Bird bird = new Bird();
		bird.id = 3;
		animalMap.put(bird.id, bird);
		
	}
}
