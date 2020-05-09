package hw5;


public class PizzaOrder {
	// instance variables
	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	private int numberPizzas;// the number of total pizzas

	// Constructors
	public PizzaOrder(){
		this(null, null, null, 0);
	}
	public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3, int numberPizzas) {
		this.pizza1 = pizza1;
		this.pizza2 = pizza2;
		this.pizza3 = pizza3;
		this.numberPizzas = numberPizzas;
	}
	

	// Mutator
	 /**set numberPizzas and the number must be between 1 and 3.
	 * @param int numberPizzas
	 * @return true for valid order.
	 */
	public boolean setNumberPizzas(int numberPizzas) {
		if(numberPizzas >= 1 && numberPizzas <= 3) {
			this.numberPizzas =  numberPizzas;
			return true;
		}
		else{
			return false;
		}
		
	}

	 /**check the numberPizzas and set Pizza .
	 * @param Pizza pizza (the reference of pizza)
	 * @return none
	 * notice: there are deep copy
	 */

	public void setPizza1(Pizza pizza1){
		if(numberPizzas < 1) {
			return;
		}
		else {
			this.pizza1 = new Pizza(pizza1);
		}
		
	} 
	public void setPizza2(Pizza pizza2){
		if(numberPizzas < 2) {
			return;
		}
		else {
			this.pizza2 = new Pizza(pizza2);
		}
		
	}
	public void setPizza3(Pizza pizza3){
		if(numberPizzas < 3) {
			return;
		}
		else {
			this.pizza3 = new Pizza(pizza3);
		}
		
	}
	 /**check the numberPizzas and calculate cost
	 * @param none
	 * @return double cost
	 */
	public double calcTotal(){
		switch(this.numberPizzas) {
			case 1:
				return pizza1.calcCost();
			case 2:
				return pizza1.calcCost() + pizza2.calcCost();
			case 3:
				return pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
			default:
				return (double)0;
		}
	}
}
