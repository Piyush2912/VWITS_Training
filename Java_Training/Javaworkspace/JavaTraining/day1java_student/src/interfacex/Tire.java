package interfacex;

public class Tire implements Bounceable {
	private int bf;
	private String color;
	
	public Tire (String tireColor) {
		color = tireColor;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	public void bounce() {
		System.out.println("It's a " + this.color + " color tire bouncing with a bounce factor of " + this.bf );
	}
	
	public void setBounceMultiple(int multiple) {
		this.bf = Bounceable.BOUNCE_FACTOR * multiple;
	}

	
}
