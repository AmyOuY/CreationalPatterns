package builderPattern;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	
	public Home getHome() {
		return builder.getHome();
	}
	
	public void manageHomeConstruction() {
		builder.buildRoof();
		builder.buildFloor();
		builder.buildWall();
	}
}
