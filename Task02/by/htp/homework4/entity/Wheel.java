package by.htp.homework4.entity;

import java.util.Objects;

public class Wheel {

	private double diametr;

	public Wheel() {

	}

	public Wheel(double diametr) {
		this.diametr = diametr;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diametr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return Double.doubleToLongBits(diametr) == Double.doubleToLongBits(other.diametr);
	}

	@Override
	public String toString() {
		return "Wheel [diametr=" + diametr + "]";
	}

}
