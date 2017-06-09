package encapsulation;

public class Main {
	
	public static void main(String [] args){
		
		AirCondition airCondition= new AirCondition();
		System.out.println(airCondition);
		airCondition.setPower(10);
		airCondition.setTemp(25);
		System.out.println(airCondition);
		
	}

}
