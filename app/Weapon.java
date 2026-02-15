package app;

/**
 * Represents a weapon-type product in the store.
 * Inherits all attributes and behavior from SalableProduct.
 */
public class Weapon extends SalableProduct {
	
	/**
	 * Creates a new Weapon with the given attributes
	 * 
	 * @param name the weapon name
	 * @param description the weapon description
	 * @param price the weapon price
	 * @param quantity the available quantity
	 */
	public Weapon(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

}
