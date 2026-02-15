package app;
/**
 * Represents a health-type product in the store.
 * Health items are salable products that inherit all attributes
 * and behavior from SalableProduct.
 */
public class Health extends SalableProduct {
	
	/**
	 * Creates a new Health item with the given attributes.
	 * 
	 * @param name        the health item name
	 * @param description the health item description
	 *  @param price       the health item price
	 *  @param quantity    the available quantity
	 */

	public Health(String name, String description, double price, int quantity) {
		super("Health", "Restores health", 25.0, 15);
		
	}

}
