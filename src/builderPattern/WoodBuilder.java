package builderPattern;

public class WoodBuilder implements Builder{

	private Home woodHome = new Home();
	
	public void buildRoof() {
		woodHome.roof = "Wooden roof";
	}
	
	public void buildFloor() {
		woodHome.floor = "Wooden floor";
	}

	public void buildWall() {
		woodHome.wall = "Wooden wall";
	}
	
	public Home getHome() {
		return woodHome;
	}
	
}
