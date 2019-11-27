package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Car {

	private List<Wheel> wheels;

	private Engine engine;
	private String model;
	private int fuel;
	private boolean move;

	{
		move = false;
	}

	public Car(Engine engine, List<Wheel> wheels, String model) {
		this.engine = engine;
		this.wheels = wheels;
		this.model = model;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public boolean isMove() {
		return move;
	}

	public void setMove(boolean move) {
		this.move = move;
	}

	@Override
	public int hashCode() {
		return Objects.hash(engine, fuel, model, move, wheels);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(engine, other.engine) && fuel == other.fuel && Objects.equals(model, other.model)
				&& move == other.move && Objects.equals(wheels, other.wheels);
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", engine=" + engine + ", model=" + model + ", fuel=" + fuel + ", move=" + move
				+ "]";
	}

}
