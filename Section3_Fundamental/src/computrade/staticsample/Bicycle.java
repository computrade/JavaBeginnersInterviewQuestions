package computrade.staticsample;

public class Bicycle {
	
	// the Bicycle class has
    // three fields
	  private int cadence;
	  private int gear;
	  private int speed;
	  private int id;
	  private static int numberOfBicycles = 0;
	  
	  
	  static{
		  
		  System.out.println("Creating the first Bicycle in a static block");
		  Bicycle bike1 = new Bicycle(100,20,5);
		  System.out.println(bike1);
	  }
        
	  
	  {
		  System.out.println("I'm inside in an instance intializer block");
		  
	  }
	 
    @Override
	public String toString() {
		return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", speed="
				+ speed + ", id=" + id + ", numberOfBicycles=" + numberOfBicycles +"]";
	}

	// the Bicycle class has
    // one constructor
    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        
     // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
    
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }
}
