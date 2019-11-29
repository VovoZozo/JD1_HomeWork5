package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Country extends Town {

	private String title;
	private Town capital;
	private List<Region> regions;
	private long area;

	public Country(String title, Town capital, List<Region> regions, long area) {
		this.capital = capital;
		this.title = title;
		this.regions = regions;
		this.area = area;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Town getCapital() {
		return capital;
	}

	public void setCapital(Town capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(area, capital, regions, title);
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
		Country other = (Country) obj;
		return area == other.area && Objects.equals(capital, other.capital) && Objects.equals(regions, other.regions)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Country [title=" + title + ", capital=" + capital + ", regions=" + regions + ", area=" + area + "]";
	}

}
