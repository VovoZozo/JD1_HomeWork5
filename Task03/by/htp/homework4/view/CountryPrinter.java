package by.htp.homework4.view;

import by.htp.homework4.entity.Country;

public class CountryPrinter {

	public void printRegionsNumber(int regionsNumber) {
		System.out.println("The number of regions of Belarus - " + regionsNumber);
	}

	public void printCapital(Country country) {
		System.out.println("The capital of Belarus is " + country.getCapital().getTitle());
	}

	public void printArea(Country country) {
		System.out.println("Belarus area =  " + country.getArea());
	}

	public void printRegions(Country country) {

		country.getRegions().forEach(action -> System.out.println(action.getTitle()));

	}
}
