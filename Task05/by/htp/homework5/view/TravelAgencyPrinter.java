package by.htp.homework5.view;

import by.htp.homework5.entity.TravelAgency;

public class TravelAgencyPrinter {

	public void tourAgencyPrinter(TravelAgency agency) {

		TourPrinter print = new TourPrinter();

		System.out.println("Travel Agency \"" + agency.getTitle() + "\":");

		print.printTourList(agency.getTours());

	}

}
