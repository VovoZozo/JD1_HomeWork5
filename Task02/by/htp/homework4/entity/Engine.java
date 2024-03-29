package by.htp.homework4.entity;

import java.util.Objects;

public class Engine {

	private String type;

	public Engine() {

	}

	public Engine(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}

}
