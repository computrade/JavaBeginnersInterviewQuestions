package encapsulation;

public class MainStart {
	
	public static void main(String [] args){
		
		AirConditionStart airConditionStart= new AirConditionStart();
		System.out.println(airConditionStart);
		airConditionStart.setWorking(true);
		airConditionStart.setPower(10);
		airConditionStart.setTemp(23);
		System.out.println(airConditionStart);
		
	}

}
