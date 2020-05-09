package hw5;

public class Pizza {
	// instance variables
	private String Size; //size : small, medium or large
	private int NumberOfCheese; // the number of cheese toppings
	private int NumberOfPepperoni; // the number of pepperoni toppings
	private int NumberOfHam; // the number of ham toppings
	
	// Constructors
	public Pizza(){
		this("small", 1, 1, 1);
	}
	public Pizza(String size, int numberOfCheese, int numberOfPepperoni, int numberOfHam) {
		Size = size;
		NumberOfCheese = numberOfCheese;
		NumberOfPepperoni = numberOfPepperoni;
		NumberOfHam = numberOfHam;
	}
	// deep copy
	public Pizza(Pizza aPizza)
	{
	  if (aPizza == null) //Not a real date.
	  {
	    System.out.println("Fatal Error.");
	    System.exit(0);
	  }

		Size = aPizza.Size;
		NumberOfCheese = aPizza.NumberOfCheese;
		NumberOfPepperoni = aPizza.NumberOfPepperoni;
		NumberOfHam = aPizza.NumberOfHam;
	}
	// Accessor & Mutator
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public int getNumberOfCheese() {
		return NumberOfCheese;
	}
	public void setNumberOfCheese(int numberOfCheese) {
		NumberOfCheese = numberOfCheese;
	}
	public int getNumberOfPepperoni() {
		return NumberOfPepperoni;
	}
	public void setNumberOfPepperoni(int numberOfPepperoni) {
		NumberOfPepperoni = numberOfPepperoni;
	}
	public int getNumberOfHam() {
		return NumberOfHam;
	}
	public void setNumberOfHam(int numberOfHam) {
		NumberOfHam = numberOfHam;
	}
	// methods
	 /**
     * @param none
     * @return price (return a double showing the price of the pizza.)
     */
	public double calcCost() {
		double price = 0;
		double total_topping = 0;
		
		total_topping = getNumberOfCheese() + getNumberOfPepperoni() +  getNumberOfHam();
		
		if(Size.equals("small")) {
			price = 10 + 2 * total_topping;
		}
		else if(Size == "medium") {
			price = 12 + 2 * total_topping;
		}
		else if(Size == "large") {
			price = 14 + 2 * total_topping;
		}
		return price;
	}
	 /**
     * @param none
     * @return str (return a string showing the information of the pizza)
     */
	public String toString() {
		// the format: "size = small, numOfCheese = 0, numOfPepperoni = 0, numOfHam = 0"
		String str = "";
		str = "size = " + getSize() + ", numOfCheese = " + Integer.toString(getNumberOfCheese()) + ", numOfPepperoni = " + Integer.toString(getNumberOfPepperoni()) + ", numOfHam = "+ Integer.toString(getNumberOfHam());
		return str;
	}
	 /**
     * @param OtherPizza
     * @return equals or not (return true if the caller Pizza object has the same information with the inputed OtherPizza object)
     */
	public boolean equals(Pizza OtherPizza) {
		// compare each of the instance variables of both objects 
		// when  OtherPizza really is an object of that class, and if OtherPizza is not equal to null
		
		if(OtherPizza == null)
		    return false;
		else if(getClass() != OtherPizza.getClass())
		    return false;
		else{ 

			return (getSize().equals(OtherPizza.getSize()) &&
					getNumberOfCheese() == OtherPizza.getNumberOfCheese()&&
					getNumberOfPepperoni() == OtherPizza.getNumberOfPepperoni()&&
					getNumberOfHam() == OtherPizza.getNumberOfHam());
		}		
	}
}
