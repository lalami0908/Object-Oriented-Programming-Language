package hw7;

public class Circle extends Shape{
	//constructor
	public  Circle (double length) {
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
		
		double answer = (length/2) * (length/2) * Math.PI;
		return Math.round(answer * 100.0) / 100.0;
		
	};
	
	
	 /** get the Perimeter
	 * @param none
	 * @return double answer
	 * The output result should round off to the 2nd decimal place.
	 * If the number is zero, the output should be "0.0".
	 */
	public double getPerimeter() {
		double answer = length * Math.PI;
		return Math.round(answer * 100.0) / 100.0;
	};

}
