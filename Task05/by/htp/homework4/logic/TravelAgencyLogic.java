package by.htp.homework4.logic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import by.htp.homework4.entity.Tour;
import by.htp.homework4.entity.TravelAgency;

public class TravelAgencyLogic {

	public List<Tour> findByCountry(TravelAgency agency, String country) {

		List<Tour> tours = new ArrayList<Tour>();

		int i;

		String thisCountry;

		for (i = 0; i < agency.getTours().size(); i++) {

			thisCountry = agency.getTours().get(i).getCountry().toString();

			if (thisCountry.equals(country)) {

				tours.add(agency.getTours().get(i));

			}
		}

		return tours;
	}

	public List<Tour> findByType(TravelAgency agency, String type) {

		List<Tour> tours = new ArrayList<Tour>();

		int i;

		String thisType;

		for (i = 0; i < agency.getTours().size(); i++) {

			thisType = agency.getTours().get(i).getType().toString();

			if (thisType.equals(type)) {

				tours.add(agency.getTours().get(i));

			}
		}

		return tours;
	}

	public List<Tour> findByFood(TravelAgency agency, String food) {

		List<Tour> tours = new ArrayList<Tour>();

		int i;

		String thisFood;

		for (i = 0; i < agency.getTours().size(); i++) {

			thisFood = agency.getTours().get(i).getFood().toString();

			if (thisFood.equals(food)) {

				tours.add(agency.getTours().get(i));

			}
		}

		return tours;
	}

	public List<Tour> findByTransport(TravelAgency agency, String transport) {

		List<Tour> tours = new ArrayList<Tour>();

		int i;

		String thisTransport;

		for (i = 0; i < agency.getTours().size(); i++) {

			thisTransport = agency.getTours().get(i).getTransport().toString();

			if (thisTransport.equals(transport)) {

				tours.add(agency.getTours().get(i));

			}
		}

		return tours;
	}

	public List<Tour> findByStartDate(TravelAgency agency, Calendar startDate) {

		List<Tour> tours = new ArrayList<Tour>();

		int i;

		Calendar thisDate;

		for (i = 0; i < agency.getTours().size(); i++) {

			thisDate = agency.getTours().get(i).getDateStart();

			if (thisDate.equals(startDate)) {

				tours.add(agency.getTours().get(i));

			}
		}

		return tours;
	}

	public List<Tour> findByDuration(TravelAgency agency, int duration) {

		List<Tour> tours = new ArrayList<Tour>();

		int i;

		int thisDuration;

		for (i = 0; i < agency.getTours().size(); i++) {

			thisDuration = agency.getTours().get(i).getDuration();

			if (thisDuration == duration) {

				tours.add(agency.getTours().get(i));

			}
		}

		return tours;
	}

}
