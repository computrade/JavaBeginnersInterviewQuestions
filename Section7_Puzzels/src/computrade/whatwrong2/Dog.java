package computrade.whatwrong2;

public class Dog extends Animal {
	
	String name;
	
	public Dog(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public void doSomething() {
        System.out.println("Dog do something");
        Person Person = new Person(this); 
        
    }
	
	public static void main(String [] args){
		Dog myDog = new Dog("Buddy");
	
	}
	
	

}
