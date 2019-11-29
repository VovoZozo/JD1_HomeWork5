package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Country;
import by.htp.homework4.entity.District;
import by.htp.homework4.entity.Region;
import by.htp.homework4.entity.Town;
import by.htp.homework4.logic.CountryLogic;
import by.htp.homework4.view.CountryPrinter;

public class CountryMain {

	public static void main(String[] args) {
		
		Town town1 = new Town("Minsk");
		Town town2 = new Town("Borisov");
		Town town3 = new Town("Zhodino");
		Town town4 = new Town("Brest");
		Town town5 = new Town("Kobrin");
		Town town6 = new Town("Birch");
		List<Town> towns1 = new ArrayList<Town>();
		towns1.add(town2);
		towns1.add(town3);
		List<Town> towns3 = new ArrayList<Town>();
		towns3.add(town1);
		List<Town> towns2 = new ArrayList<Town>();
		towns2.add(town5);
		towns2.add(town6);
		List<Town> towns4 = new ArrayList<Town>();
		towns3.add(town4);
		District district1 = new District("Borisov District", town2,  towns1);
		District district3 = new District("Minsk District", town1,  towns3);
		District district2 = new District("Kobrin District", town5,  towns2);
		District district4 = new District("Brest District", town4,  towns4);
		List<District> districts1 = new ArrayList<District>();
		districts1.add(district1);
		districts1.add(district3);
		List<District> districts2 = new ArrayList<District>();
		districts2.add(district2);
		districts2.add(district4);
		Region region1 = new Region("Minsk Region", town1, districts1);
		Region region2 = new Region("Brest Region", town4, districts2);
		List<Region> regions1 = new ArrayList<Region>();
		regions1.add(region1);
		regions1.add(region2);
		Country country = new Country("Belarus", town1, regions1 , 12000L);
		
		CountryLogic countryLogic = new CountryLogic();
		
		int regionsCount = countryLogic.regionsCount(country);
		
		CountryPrinter print = new CountryPrinter();
		print.printRegionsNumber(regionsCount);
		print.printCapital(country);
		print.printArea(country);
		print.printRegions(country);
	}

}
