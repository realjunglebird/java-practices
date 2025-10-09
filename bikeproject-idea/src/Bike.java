public class Bike implements BikeParts {
	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public Bike(){	
		this.make = "Oracle Cycles";
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Cycles";
	}//end constructor

    @Override
    public String getHandleBars() { return handleBars; }
    @Override
    public void setHandleBars(String value) { handleBars = value; }

    @Override
    public String getFrame() { return frame; }
    @Override
    public void setFrame(String value) { frame = value; }

    @Override
    public String getSeatType() { return seatType; }
    @Override
    public void setSeatType(String value) { seatType = value; }

    @Override
    public String getTyres() { return tyres; }
    @Override
    public void setTyres(String value) { tyres = value; }

    @Override
    public int getNumGears() { return NumGears; }
    @Override
    public void setNumGears(int value) { NumGears = value; }

    @Override
    public String getMake() { return make; }

	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

}//end class Bike