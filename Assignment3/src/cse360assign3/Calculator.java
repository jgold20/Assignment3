
package cse360assign3;

/** Calculator 
 * @author Joshua Gold
 * @version 2/21/16
 * 
 */

public class Calculator {

	private int total;
	private String history;
	
	/** Creates calculator object */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	
	/** Returns the total
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	
	/** Adds a value to the total
	 * 
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	
	/** Subtracts a value from the total
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	
	/** Multiplies the total by a value
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	
	/** Divides the total by a value
	 * 
	 * @param value
	 */
	public void divide (int value) {
		if(value != 0)
			total = total / value;
		else
			total = 0;
		
		history = history + " / " + value;
	}
	
	
	/** Returns a string containing the history of all actions on the calculator
	 * 
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
}