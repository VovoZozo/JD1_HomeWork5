package by.htp.homework4.logic;

import by.htp.homework4.entity.Country;

public class CountryLogic {

	public int regionsCount(Country country) {

		int count = 0;
		int i;
		
		for (i = 0; i < country.getRegions().size(); i++) {
			count++;
		}
		
		return count;
		
	}
}
