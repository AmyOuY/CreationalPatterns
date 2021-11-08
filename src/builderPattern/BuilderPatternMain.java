package builderPattern;

public class BuilderPatternMain {

	public static void main(String[] args) {
		
		WoodBuilder woodBuilder = new WoodBuilder();
		
		Director director = new Director(woodBuilder);
		
		director.manageHomeConstruction();
		Home homeConstructed = director.getHome();
		
		System.out.println(homeConstructed);
		System.out.println(homeConstructed.wall);
		
		
		SteelBuilder steelBuilder = new SteelBuilder();
		
		Director director2 = new Director(steelBuilder);
		
		director2.manageHomeConstruction();
		Home homeConstructed2 = director2.getHome();
		
		System.out.println(homeConstructed2);
		System.out.println(homeConstructed2.wall);
	}
}
