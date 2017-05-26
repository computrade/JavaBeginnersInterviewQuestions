package aircondition;


public class AirConditioner {

		 
	    int ChangePower = 0;
	    int HeatCold = 0;
	    int Economy = 1;
	    int Temp = 10;
	    
	    public int getChangePower() {
			return ChangePower;
		}

		public void setChangePower(int changePower) {
			ChangePower = changePower;
		}

		public int getHeatCold() {
			return HeatCold;
		}

		public void setHeatCold(int heatCold) {
			HeatCold = heatCold;
		}

		public int getEconomy() {
			return Economy;
		}

		public void setEconomy(int economy) {
			Economy = economy;
		}

		public int getTemp() {
			return Temp;
		}

		public void setTemp(int temp) {
			Temp = temp;
		}
		

	 
	    void ChangePower(int newValue) {
	         ChangePower = newValue;
	    }
	 
	    void HeatCold(int newValue) {
	         HeatCold = newValue;
	    }
	 
	    void Economy(int newValue) {
	         Economy = newValue;   
	    }
	 
	    void Tempup(int increment) {
	         Temp = Temp + increment;
	    }
	    void Tempdown(int decrement) {
	         Temp = Temp - decrement;
	    }
	    void printStates() {
	         System.out.println("Power:" +
	             ChangePower + "  HeatCold:" + 
	             HeatCold + "  Economy:" + Economy
	             +"  Temp:" + Temp);
	    }
	}
	
