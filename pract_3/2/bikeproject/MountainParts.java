package bikeproject;

public interface MountainParts {

	// константа: тип местности для горного велосипеда
	String TERRAIN = "off_road";

	String getSuspension();
	void setSuspension(String newValue);

	String getType();
	void setType(String newValue);

}//end interface MountainParts
