package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

import by.htp.homework4.entity.Food;
import by.htp.homework4.entity.Tour;
import by.htp.homework4.entity.TourCountry;
import by.htp.homework4.entity.TourType;
import by.htp.homework4.entity.Transport;
import by.htp.homework4.entity.TravelAgency;
import by.htp.homework4.logic.TourComparator;
import by.htp.homework4.logic.TravelAgencyLogic;
import by.htp.homework4.view.TourPrinter;
import by.htp.homework4.view.TravelAgencyPrinter;

public class Main {

	public static void main(String[] args) {

		Calendar dateTour1 = new GregorianCalendar();
		dateTour1.set(2019, 11, 21);
		Calendar dateTour2 = new GregorianCalendar();
		dateTour2.set(2020, 2, 15);
		Calendar dateTour3 = new GregorianCalendar();
		dateTour3.set(2020, 5, 10);
		Calendar dateTour4 = new GregorianCalendar();
		dateTour4.set(2019, 10, 30);

		Tour tour1 = new Tour(TourCountry.Australia, TourType.Art, Food.FB, Transport.Plane, dateTour1, 21);
		Tour tour2 = new Tour(TourCountry.Bali, TourType.Sporting, Food.UAI, Transport.Ship, dateTour2, 14);
		Tour tour3 = new Tour(TourCountry.Bangkok, TourType.Combining, Food.AI, Transport.Plane, dateTour3, 35);
		Tour tour4 = new Tour(TourCountry.Russia, TourType.Adventure, Food.BB, Transport.Train, dateTour4, 7);

		List<Tour> tours = new ArrayList<Tour>();
		tours.add(tour1);
		tours.add(tour2);
		tours.add(tour3);
		tours.add(tour4);

		TravelAgency agency1 = new TravelAgency("Sun", tours);
		TourPrinter print = new TourPrinter();
		print.printTour(tour1);

		TravelAgencyPrinter printTours = new TravelAgencyPrinter();
		printTours.tourAgencyPrinter(agency1);

		Collections.sort(agency1.getTours(), TourComparator.tourCalendarComparator);
		printTours.tourAgencyPrinter(agency1);

		Collections.sort(agency1.getTours(), TourComparator.tourCountryComparator);
		printTours.tourAgencyPrinter(agency1);

		Collections.sort(agency1.getTours(), TourComparator.tourDurationComparator);
		printTours.tourAgencyPrinter(agency1);

		Collections.sort(agency1.getTours(), TourComparator.tourFoodComparator);
		printTours.tourAgencyPrinter(agency1);

		Collections.sort(agency1.getTours(), TourComparator.tourTransportComparator);
		printTours.tourAgencyPrinter(agency1);

		Collections.sort(agency1.getTours(), TourComparator.tourTypeComparator);
		printTours.tourAgencyPrinter(agency1);

		TravelAgencyLogic logic = new TravelAgencyLogic();

		print.printTourList(logic.findByCountry(agency1, TourCountry.Australia.toString()));
		print.printTourList(logic.findByDuration(agency1, 14));
		print.printTourList(logic.findByFood(agency1, Food.AI.toString()));
		print.printTourList(logic.findByStartDate(agency1, dateTour3));
		print.printTourList(logic.findByTransport(agency1, Transport.Plane.toString()));
		print.printTourList(logic.findByType(agency1, TourType.Art.toString()));
	}

}
