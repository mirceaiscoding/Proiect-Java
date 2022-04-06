package com.app.business;

import com.app.shared.Rating;

public class GroceryShop extends Business {

	public GroceryShop(String name, Rating rating) {
		super(name, rating);
	}
	
	@Override
	public String toString() {
		return "Grocery shop: " + super.toString();
	}

}
