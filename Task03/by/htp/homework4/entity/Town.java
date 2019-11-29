package by.htp.homework4.entity;

import java.util.Objects;

public class Town {

	private String title;

	public Town() {
		
	}

	public Town(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Town [title=" + title + "]";
	}

}
