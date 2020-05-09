package hw6;

public class SimpleArrayList {
	private int size;
	private Integer[] array;
	
	// Default constructor that sets the array size to zero
	public SimpleArrayList(){
		this(0);
	}
	// Constructor that can set initial array size
	// and set all Integer to zero in the array.
	public SimpleArrayList(int size) {
		this.size = size;
		this.array = new Integer[size];
		for(int i = 0; i < size; i++) {
			array[i] = 0;
		}
	}

	 /**appends the specified element to the end of this array.
	 * renew the Integer array after size changed
	 * @param Integer new_i
	 * @return none
	 */
	public void add(Integer new_i){
		size += 1;
		Integer[] new_array = new Integer[size];
		for(int i = 0; i < size - 1; i++) {
			new_array[i] = array[i];
		}
		new_array[size - 1] = new_i;
		array = new_array;	
	}
	 /**returns the element at the specified position in this array.
	 * If the specified position is out of range of the array, returns null.
	 * @param Integer index
	 * @return Integer at the specified position
	 */
	public Integer get(int index) {
		if(index > size - 1) {
			return null;
		}
		else{
			// TODO: copy?
			return array[index];
		}
	}

	 /**replaces the element at the specified position in this array with the specified element
	 * If the specified position is out of range of the array, returns null.
	 * @param int index, Integer element
	 * @return Integer the original element at that specified position.
	 */
	public Integer set(int index, Integer element){
		if(index > size - 1) {
			return null;
		}
		else{
			// return object?
			Integer original = array[index];
			array[index] = element;
			return original;
		}

	} 
	 /**removes element at the specified position
	 * @param int index, Integer element
	 * @return boolean retrun true if removed successfully,
				else if a null element is at the specified position or out of range, returns false
	 */
	public boolean remove(int index) {
		if(index > size - 1) {
			return false;
		}
		else if(array[index] == null) {
			return false;
		}
		else{
			size -= 1;
			Integer[] new_array = new Integer[size];
			for(int i = 0; i < index; i++) {
				new_array[i] = array[i];
			}
			for(int i = index; i < size; i++) {
				new_array[i] = array[i+1];
			}
			array = new_array;
			return true;
		}
	}
		 /**removes all of the elements from this array.
	 * @param none
	 * @return none
	 */
	public void clear() {
		size = 0;
		array = null;
		
	}
	 /**returns the number of elements in this array.
	 * @param none
	 * @return int size
	 */
	public int size() {
		return this.size;
	}
	 /**retains only the elements in this array that are contained in the specified SimpleArrayList. 
	  *In other words, removes from this array all of its elements that are not contained in the specified SimpleArrayList. 
	 * @param SimpleArrayList l
	 * @return boolean if the array has been changed
	 */
	public boolean retainAll(SimpleArrayList l) {
		int i = 0;
		boolean change = false;
		while( i < this.size) { // check every element in the arraylist
			boolean exist = false;
			for(int j = 0; j < l.size; j++) {
				if(l.array[j] == this.array[i]) { // if the element exists in SimpleArrayList l
					exist = true;
					break;
				}
				
			}
			if(!exist) {
				this.remove(i);
				change = true;
			}
			else {
				i++;
			}
		}
		return change;
	}
}
