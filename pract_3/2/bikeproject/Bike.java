package bikeproject;

public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	
	public Bike(){	
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
	}//end constructor

	// реализация методов интерфейса BikeParts
	public String getHandleBars() {
		return handleBars;
	}//end method getHandleBars

	public void setHandleBars(String newValue) {
		handleBars = newValue;
	}//end method setHandleBars

	public String getFrame() {
		return frame;
	}//end method getFrame

	public void setFrame(String newValue) {
		frame = newValue;
	}//end method setFrame

	public String getTyres() {
		return tyres;
	}//end method getTyres

	public void setTyres(String newValue) {
		tyres = newValue;
	}//end method setTyres

	public String getSeatType() {
		return seatType;
	}//end method getSeatType

	public void setSeatType(String newValue) {
		seatType = newValue;
	}//end method setSeatType

	public int getNumGears() {
		return NumGears;
	}//end method getNumGears

	public void setNumGears(int newValue) {
		NumGears = newValue;
	}//end method setNumGears

	protected void printDescription()
	{
		// MAKE - константа из интерфейса BikeParts
		System.out.println("\n" + MAKE + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike
