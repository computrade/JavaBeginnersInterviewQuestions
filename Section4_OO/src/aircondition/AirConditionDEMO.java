package aircondition;



public class AirConditionDEMO {
	public static void main(String[] args) {
	 
    // Create two different instances
    // A/C objects
    AirConditioner AC1 = new AirConditioner();
    AirConditioner AC2 = new AirConditioner();
    TadiranAirCondition AC3 = new TadiranAirCondition();

    
    AC3.ChangePower(1);
    AC3.HeatCold(0);
    AC3.Tempdown(2);
    AC3.Economy(1);
    
    // Invoke methods on 
    // those objects
    AC1.ChangePower(1);
    AC1.HeatCold(0);
    AC1.Tempdown(2);
    AC1.Economy(1);
    AC1.printStates();

    AC2.ChangePower(1);
    AC2.HeatCold(1);
    AC2.Tempup(6);
    AC2.Economy(1);
    AC2.printStates();
}
}
