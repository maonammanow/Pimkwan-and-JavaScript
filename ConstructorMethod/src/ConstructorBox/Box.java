package ConstructorBox;

public class Box {
	
	double width;
	double height;
	double depth;
	
	public Box(double w, double h, double d) {
		
		width = w;
		height = h;
		depth = d;
		
	}
	public double volume() {
		return depth * width * height;
	}

}
