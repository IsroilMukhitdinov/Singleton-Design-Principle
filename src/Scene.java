

public class Scene {
	
	private Color color;
	private double length;
	
	public Scene() {
		color = Color.WHITE;
		length = 0.0;
	}
	public Scene(Color color,double length) {
		this.color = color;
		this.length = length;
	}
	
	public Color getColor() {
		return color;
	}
	public double getLength() {
		return length;
	}
	
	// override equals method here
}
