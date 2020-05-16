package hw7;

public abstract class Shape {
	// stores the side length for regular triangle, square, 
	// and stores the diameter for circle.
	protected double length;	

	public Shape(double length){
		this.length=length;
	}
	
	public abstract void setLength(double length);
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public String getInfo(){
		return "Area = "+getArea()+
			   ", Perimeter = "+getPerimeter();
	}
}