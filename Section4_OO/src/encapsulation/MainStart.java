package encapsulation;

public class MainStart {
	
	public static void main(String [] args){
		
		AirConditionStart airConditionStart= new AirConditionStart();
		System.out.println(airConditionStart);
		airConditionStart.working=true;
		airConditionStart.power=10;
		airConditionStart.temp=23;
		System.out.println(airConditionStart);
		
	}

}
