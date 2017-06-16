package aircondition;

public class TadiranAirCondition implements InterfaceAirConditioner {

	int ChangePower;
	int HeatCold;
	int Economy;
	int Tempup;
	int Tempdown;
	private static final int Temp = 25;

	public void ChangePower(int newValue) {
		ChangePower = newValue;
	}

	public void HeatCold(int newValue) {
		HeatCold = newValue;
	}

	public void Economy(int newValue) {
		Economy = newValue;
	}

	public void Tempup(int increment) {
		Tempup = Temp + increment;
	}

	public void Tempdown(int decrement) {
		Tempdown = Temp - decrement;
	}
}
