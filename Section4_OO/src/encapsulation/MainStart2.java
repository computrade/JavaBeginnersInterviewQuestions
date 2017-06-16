package encapsulation;

public class MainStart2 {
	
	public static void main(String [] args){
		
		AirConditionStart airConditionStart= new AirConditionStart();
		System.out.println(airConditionStart);
		airConditionStart.setTemp(25);
		System.out.println(airConditionStart);
		airConditionStart.increaseTemp();
		System.out.println(airConditionStart);
		airConditionStart.decreaseTemp();
		System.out.println(airConditionStart);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void setPowerValue(AirConditionStart2 airCondition,int power) {
		
		if(power<0 || power>20){
			throw new IllegalArgumentException("power should be between 0 to 20.");
		}
		
		airCondition.setPower(power);
	
	}

	private static void setTempValue(AirConditionStart2 airCondition,int temp) {
		
		if(temp<10 || temp>30){
			throw new IllegalArgumentException("temp should be between 10 to 30.");
		}
		airCondition.setTemp(temp);
		
	}

}
