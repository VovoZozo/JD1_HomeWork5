package by.htp.homework5.entity;

import java.util.List;
import java.util.Objects;

public class TravelAgency {

	private String title;
	private List<Tour> tours;

	public TravelAgency() {

	}

	public TravelAgency(String title, List<Tour> tours) {
		this.title = title;
		this.tours = tours;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, tours);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelAgency other = (TravelAgency) obj;
		return Objects.equals(title, other.title) && Objects.equals(tours, other.tours);
	}

	@Override
	public String toString() {
		return "TravelAgency [title=" + title + ",\ntours=" + tours + "]";
	}

}
