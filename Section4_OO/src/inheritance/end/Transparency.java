package inheritance.end;

public interface Transparency {
	
	default void setTransparency(int transparency){
		System.out.println("The setTransparency wasn't implemented");
	}

}
