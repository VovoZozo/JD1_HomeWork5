package by.htp.homework4.logic;

import java.util.Comparator;

import by.htp.homework4.entity.Tour;

public class TourComparator implements Comparator<Tour> {

	@Override
	public int compare(Tour arg0, Tour arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Comparator<Tour> tourCountryComparator = new Comparator<Tour>() {

		@Override
		public int compare(Tour e1, Tour e2) {
			return e1.getCountry().toString().compareTo(e2.getCountry().toString());
		}

	};

	public static Comparator<Tour> tourCalendarComparator = new Comparator<Tour>() {

		@Override
		public int compare(Tour e1, Tour e2) {
			return e1.getDateStart().compareTo(e2.getDateStart());
		}

	};

	public static Comparator<Tour> tourTypeComparator = new Comparator<Tour>() {

		@Override
		public int compare(Tour e1, Tour e2) {
			return e1.getType().toString().compareTo(e2.getType().toString());
		}

	};

	public static Comparator<Tour> tourTransportComparator = new Comparator<Tour>() {

		@Override
		public int compare(Tour e1, Tour e2) {
			return e1.getTransport().toString().compareTo(e2.getTransport().toString());
		}

	};

	public static Comparator<Tour> tourFoodComparator = new Comparator<Tour>() {

		@Override
		public int compare(Tour e1, Tour e2) {
			return e1.getFood().toString().compareTo(e2.getFood().toString());
		}

	};

	public static Comparator<Tour> tourDurationComparator = new Comparator<Tour>() {

		@Override
		public int compare(Tour e1, Tour e2) {
			return e1.getDuration() - e2.getDuration();
		}

	};

}
