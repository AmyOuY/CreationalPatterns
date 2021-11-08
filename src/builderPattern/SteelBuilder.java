package builderPattern;

public class SteelBuilder implements Builder {

	private Home steelHome = new Home();
	
	public void buildRoof() {
		steelHome.roof = "Steel roof";
	}
	
	public void buildFloor() {
		steelHome.floor = "Steel floor";
	}
	
	public void buildWall() {
		steelHome.wall = "Steel wall";
	}
	
	public Home getHome() {
		return steelHome;
	}
}
