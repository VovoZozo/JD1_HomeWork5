package by.htp.homework5.entity;

import java.util.Calendar;
import java.util.Objects;

public class Tour {

	private TourCountry country;
	private TourType type;
	private Food food;
	private Transport transport;
	private Calendar dateStart;
	private int duration;

	public Tour() {

	}

	public Tour(TourCountry country, TourType type, Food food, Transport transport, Calendar dateStart, int duration) {
		this.country = country;
		this.type = type;
		this.food = food;
		this.transport = transport;
		this.dateStart = dateStart;
		this.duration = duration;
	}

	public TourCountry getCountry() {
		return country;
	}

	public void setCountry(TourCountry country) {
		this.country = country;
	}

	public TourType getType() {
		return type;
	}

	public void setType(TourType type) {
		this.type = type;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Calendar getDateStart() {
		return dateStart;
	}

	public void setDateStart(Calendar dateStart) {
		this.dateStart = dateStart;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, dateStart, duration, food, transport, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		return country == other.country && Objects.equals(dateStart, other.dateStart) && duration == other.duration
				&& food == other.food && transport == other.transport && type == other.type;
	}

	@Override
	public String toString() {
		return "Tour [\ncountry=" + country + ",\ntype=" + type + ",\nfood=" + food + ",\ntransport=" + transport
				+ ",\ndateStart=" + dateStart + ",\nduration=" + duration + "]";
	}

}
