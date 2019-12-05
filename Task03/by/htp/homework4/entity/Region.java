package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Region {
	
	private String title;
	private Town center;
	private List<District> districts;

	public Region(String title, Town center, List<District> districts) {
		this.center = center;
		this.title = title;
		this.districts = districts;
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

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(center, districts, title);
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
		Region other = (Region) obj;
		return Objects.equals(center, other.center) && Objects.equals(districts, other.districts)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Region [title=" + title + ", center=" + center + ", districts=" + districts + "]";
	}

	
}
