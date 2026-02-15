package app;

/**
 * Represents a product that can be sold in the store.
 * Each product has a name, description, price, and quantity.
 * Implements Comparable so products can be sorted by name (ignore case),
 * and then by price if names are equal.
 */
public abstract class SalableProduct implements Comparable<SalableProduct>{
	
	/**
	 * products that can be sold in the store
	 * each product has name, description, price, and quantity
	 */
	private String name;
	private String description;
	private double price;
	private int quantity;
	
	

	/**
     * Creates a new salable product with the given attributes.
     *
     * @param name        the product name
     * @param description the product description
     * @param price       the product price
     * @param quantity    the available quantity
     */
	public SalableProduct(String name, String description, double price, int quantity) { 
		this.name = name; 
		this.description = description; 
		this.price = price; 
		this.quantity = quantity; 
		}	
	
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 
	 * @return price
	 */
	public double getPrice() {
		return price;
		
	}
	/**
	 * 
	 * @return quantity
	 */
	
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * setters
	 */

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/** * Compares two SalableProduct objects first by name (case-insensitive), 
	 * and if the names are equal, compares by price.
	 * 
	 * @param other the other product to compare to 
	 *  @return negative if this < other, positive if this > other, 0 if equal
	 */ 
	@Override 
	public int compareTo(SalableProduct other) { 
		// Compare by name ignoring case
		int nameCompare = this.name.compareToIgnoreCase(other.name); 
		if (nameCompare != 0) { 
			return nameCompare; 
			} // If names are equal, compare by price
		return Double.compare(this.price, other.price); 
		}	
	
	/**
	 * returns string to represent the product 
	 * and price and how much is available
	 */
	@Override
	public String toString() {
		return name + " - $" + price + " (" + quantity + " available)";
	}
}
