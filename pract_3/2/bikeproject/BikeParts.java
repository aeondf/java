package bikeproject;

public interface BikeParts {

	// название компании-производителя - неизменяемое значение (public static final)
	String MAKE = "Oracle Cycles";

	// методы, которые должен реализовать любой класс, использующий интерфейс
	String getHandleBars();
	void setHandleBars(String newValue);

	String getFrame();
	void setFrame(String newValue);

	String getTyres();
	void setTyres(String newValue);

	String getSeatType();
	void setSeatType(String newValue);

	int getNumGears();
	void setNumGears(int newValue);

}//end interface BikeParts
