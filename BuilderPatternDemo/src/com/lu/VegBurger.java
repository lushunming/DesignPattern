package com.lu;

public class VegBurger extends Burger {

	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
