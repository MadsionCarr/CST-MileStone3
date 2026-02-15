package app;

/**
	 * Represents an armor-type product in the store.
	 * Armor items are salable products that inherit all attributes
	 * and behavior from SalableProduct.
	 *
 */

public class Armor extends SalableProduct {
		
		/**
		 * created new armor with preset attributes
		 * @param name the armor name
		 * @param description the armor description
		 * @param price the armor price
		 * @param quantity the available quantity
		 */
		public Armor(String name, String description, double price, int quantity) {
			super(name, description, price, quantity);
		}

	}

