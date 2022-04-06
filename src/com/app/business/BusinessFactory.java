package com.app.business;

import com.app.shared.Rating;

public class BusinessFactory {
	public static Business makeBusiness(String type, String name) {
		switch (type) {
		case "Restaurant":
			return new Restaurant(name, new Rating());
		case "GroceryShop":
			return new GroceryShop(name, new Rating());
		default:
			return new Business(name, new Rating());
		}
	}
}
