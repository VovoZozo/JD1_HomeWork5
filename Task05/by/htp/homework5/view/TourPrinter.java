package by.htp.homework5.view;

import java.text.SimpleDateFormat;
import java.util.List;

import by.htp.homework5.entity.Tour;

public class TourPrinter {

	public void printTour(Tour tour) {

		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(tour.getCountry() + ":");

		System.out.println(formatDate.format(tour.getDateStart().getTime()));

		System.out.println("Duration " + tour.getDuration() + " days");

		System.out.println("Food " + tour.getFood());

		System.out.println("Transport " + tour.getTransport());

		System.out.println("Type " + tour.getType());

		System.out.println();
	}

	public void printTourList(List<Tour> tours) {

		tours.forEach(arg -> printTour(arg));

	}
}
