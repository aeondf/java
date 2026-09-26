package bikeproject;

public interface RoadParts {

	// константа: тип местности для шоссейного велосипеда
	String terrain = "track_racing";

	int getTyreWidth();
	void setTyreWidth(int newValue);

	int getPostHeight();
	void setPostHeight(int newValue);

}//end interface RoadParts
