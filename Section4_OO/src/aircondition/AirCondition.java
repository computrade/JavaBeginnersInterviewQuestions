package aircondition;

public class AirCondition {

	int Power = 0;
    int HeatCold = 0;
    int Temp = 20;
    int Economy = 0;
 
    void changePower(int newValue) {
         Power = newValue;
    }
 
    void changeHeatCold(int newValue) {
         HeatCold = newValue;
    }
 
    void Temp(int increment) {
         Temp = Temp + increment;   
    }
 
    void Economy(int newValue) {
         Economy = newValue;
    }
 
    void printStates() {
         System.out.println("Power:" +
             Power + "HeatCold:" + 
             HeatCold + "Temp:" + Temp
             + "Economy:"+ Economy);
    }
}
