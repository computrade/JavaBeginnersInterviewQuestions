package encapsulation;

public class AirCondition {

	private int power;
	private boolean working;
	private int temp;
	
	public boolean isWorking() {
		return working;
	}

	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		
		if(power<0 || power>20){
			throw new IllegalArgumentException("power should be between 0 to 20.");
		}
		
		this.power = power;
		
		if(power==0){
			working=false;
		}else if(power>0){
			working=true;
		}
		
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		if(temp<10 || temp>30){
			throw new IllegalArgumentException("temp should be between 10 to 30.");
		}
		this.temp = temp;
		working=true;
		if(power==0){
			this.power = 5;
		}
		
	}

	public void increaseTemp() {
		this.temp++;
	}
	
	public void decreaseTemp() {
		this.temp--;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirCondition [power=");
		builder.append(power);
		builder.append(", working=");
		builder.append(working);
		builder.append(", temp=");
		builder.append(temp);
		builder.append("]");
		return builder.toString();
	}

}
