package hw7;

public class Triangle extends Shape{
	//constructor
	public Triangle(double length) {
		super(length);	
	}
	
	 /** set the length
	 * @param double length
	 * @return none
	 */
	public void setLength(double length) {
		this.length = length;
	};
	
	
	 /** get the Area
	 * @param none
	 * @return double answer
	 * The output result should round off to the 2nd decimal place.
	 * If the number is zero, the output should be "0.0".
	 */
	public double getArea(){
		double answer = Math.sqrt(3)/4 * Math.pow(length, 2);
		return Math.round(answer * 100.0) / 100.0;		
	};
	
	
	 /** get the Perimeter
	 * @param none
	 * @return double answer
	 * The output result should round off to the 2nd decimal place.
	 * If the number is zero, the output should be "0.0".
	 */
	public double getPerimeter() {
		return length * 3;
	};

}
