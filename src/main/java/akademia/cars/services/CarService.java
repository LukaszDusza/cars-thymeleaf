package akademia.cars.services;

import akademia.cars.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getSportCars();

    List<Car> getOffroadCars();

    void addSportCar(Car car);

    void addOffroadCar(Car car);
}
