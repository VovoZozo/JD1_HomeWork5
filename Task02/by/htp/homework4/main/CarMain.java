package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Car;
import by.htp.homework4.entity.Engine;
import by.htp.homework4.entity.Wheel;
import by.htp.homework4.logic.CarLogic;
import by.htp.homework4.view.CarPrinter;

public class CarMain {

	public static void main(String[] args) {

		Wheel wheel = new Wheel(16.5);
		List<Wheel> wheels = new ArrayList<Wheel>();
		wheels.add(wheel);
		wheels.add(wheel);
		wheels.add(wheel);
		wheels.add(wheel);

		Engine engine = new Engine("Diesel");

		Car car = new Car(engine, wheels, "Mercedes AMG");

		System.out.println(car.toString());

		CarLogic logic = new CarLogic();

		logic.start(car);
		System.out.println(car.toString());

		logic.refuel(car, 50);
		System.out.println(car.toString());

		logic.start(car);
		System.out.println(car.toString());

		logic.stop(car);
		System.out.println(car.toString());

		CarPrinter print = new CarPrinter();
		print.modelPrinter(car);
	}

}
