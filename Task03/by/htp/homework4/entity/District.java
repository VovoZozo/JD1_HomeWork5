package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class District {

	private String title;
	private Town center;
	private List<Town> towns;

	public District(String title, Town center, List<Town> towns) {
		this.center = center;
		this.title = title;
		this.towns = towns;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Town getCenter() {
		return center;
	}

	public void setCenter(Town center) {
		this.center = center;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(center, title, towns);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(center, other.center) && Objects.equals(title, other.title)
				&& Objects.equals(towns, other.towns);
	}

	@Override
	public String toString() {
		return "District [title=" + title + ", center=" + center + ", towns=" + towns + "]";
	}

}
