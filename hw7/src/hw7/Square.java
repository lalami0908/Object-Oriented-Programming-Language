package hw7;

public class Square extends Shape {
	//constructor
	public Square(double length) {
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
		double answer = length * length;
		return Math.round(answer * 100.0) / 100.0;	
	};
	
	
	 /** get the Perimeter
	 * @param none
	 * @return double answer
	 * The output result should round off to the 2nd decimal place.
	 * If the number is zero, the output should be "0.0".
	 */
	public double getPerimeter() {
		return length * 4;
	};

}
