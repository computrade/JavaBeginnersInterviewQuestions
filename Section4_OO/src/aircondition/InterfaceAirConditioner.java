package aircondition;

public interface InterfaceAirConditioner {
 
    void ChangePower(int newValue);
    void HeatCold(int newValue);
    void Economy(int newValue);
    void Tempup(int increment);
    void Tempdown(int decrement);
     }
