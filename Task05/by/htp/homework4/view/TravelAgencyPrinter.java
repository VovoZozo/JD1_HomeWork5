package by.htp.homework4.view;

import by.htp.homework4.entity.TravelAgency;

public class TravelAgencyPrinter {

	public void tourAgencyPrinter(TravelAgency agency) {

		TourPrinter print = new TourPrinter();

		System.out.println("Travel Agency \"" + agency.getTitle() + "\":");

		print.printTourList(agency.getTours());

	}

}
