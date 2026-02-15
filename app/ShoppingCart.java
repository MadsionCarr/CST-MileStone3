package app;

import java.util.ArrayList;
import java.util.List;

/**
 * represents users cart
 * stores products and qty, calculated total
 */
public class ShoppingCart {
	
	private List<SalableProduct> items = new ArrayList<>();
	
	/**
	 * add a product to the cart 
	 * @param product
	 */
	
	public void addItem(SalableProduct product) {
		if(product != null) {
			items.add(product);
		}
	
	}
	
	/**
	 * removes product from cart by name
	 * 
	 * @param name the product name
	 */
	public void removeItem(String name) {
		for (int i = 0; i < items.size(); i++) { 
			if (items.get(i).getName().equalsIgnoreCase(name)) {
				items.remove(i); 
				return;
			}
		}
	}
	
	/**
	 *  Empties all items from the cart. 
	 */ 
	public void emptyCart() { 
		items.clear(); 
		}
	
	/**
	 * displays content of the cart plus price
	 * 
	 * @return list of items in the cart
	 */
	public List<SalableProduct> viewCart() {
			return items;
		}
		
	
	/**
	 * calculates total cost of items in cart
	 * 
	 * @return
	 */
	public double getTotal() {
		double total = 0;
		
		for (SalableProduct p : items) {
			total += p.getPrice();
		}
		
		return total;
	}
}
