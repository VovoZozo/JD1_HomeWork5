package by.htp.homework4.logic;

import by.htp.homework4.entity.Car;
import by.htp.homework4.entity.Wheel;

public class CarLogic {

	public void start(Car car) {

		if (car.getFuel() != 0) {
			car.setMove(true);
		} else {
			car.setMove(false);
		}

	}

	public void stop(Car car) {

		car.setMove(false);

	}

	public boolean refuel(Car car, int fuel) {

		if (!car.isMove()) {
			car.setFuel(car.getFuel() + fuel);
			return true;
		} else {
			return false;
		}

	}

	public boolean changeWheel(Car car, int wheelNumber, Wheel wheel) {

		if (!car.isMove()) {
			car.getWheels().set(wheelNumber, wheel);
			return true;
		} else {
			return false;
		}

	}

}
