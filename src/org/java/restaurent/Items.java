package org.java.restaurent;

public class Items {
	
	public void menuu()
	{
		Menu  menu = new Menu();

		menu.nonVeg.put(1, "ChickenBiryani      Rs: 120");
		menu.nonVeg.put(2, "MuttonBiryani       Rs: 130");
		menu.nonVeg.put(3, "Rotti            Rs: 20");
		menu.nonVeg.put(4, "ChickenCurry        Rs: 60");

		menu.veg.put(1, "VegBiryan       Rs: 100");
		menu.veg.put(2, "TomatoRice      Rs: 80");
		menu.veg.put(3, "PannerBiryani   Rs: 140");
		//menu.veg.put(4, "VegFrideRice    Rs: 110");

		menu.displayMenu();
	}
}
