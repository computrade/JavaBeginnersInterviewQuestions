package encapsulation;

public class AirConditionStart {

	 int power;
	 boolean working;
	 int temp;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirConditionStart [power=");
		builder.append(power);
		builder.append(", working=");
		builder.append(working);
		builder.append(", temp=");
		builder.append(temp);
		builder.append("]");
		return builder.toString();
	}
	
}
