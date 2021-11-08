package builderPattern;

public interface Builder {

	void buildRoof();
	
	void buildFloor();
	
	void buildWall();
	
	Home getHome();
}
