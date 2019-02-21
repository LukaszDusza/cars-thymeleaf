package akademia.cars.services;

import akademia.cars.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> sportCars;
    private List<Car> offroadCars;

    public CarServiceImpl() {
        loadSportCars();
        loadOffroadCars();
    }

    @Override
    public List<Car> getSportCars() {
        return sportCars;
    }

    @Override
    public List<Car> getOffroadCars() {
        return offroadCars;
    }

    private void loadSportCars() {

        sportCars = new ArrayList<>();
        sportCars.add(new Car("Audi", "A3", "120", "2016", "https://www.autocentrum.pl/ac-file/car-version/597f0acc592c7da9128b4573/audi-a3-10.jpg"));
        sportCars.add(new Car("Audi", "S8", "120", "2016", "https://avatars.mds.yandex.net/get-pdb/234183/803ec373-9792-4cbd-8d62-5703a1d4670c/orig"));
        sportCars.add(new Car("Audi", "S7", "120", "2016", "https://m.autokult.pl/audi-s7-test-autokult-3--1cf6df4,910,500,0,0.jpg"));
        sportCars.add(new Car("Audi", "RS 7", "120", "2016", "https://hips.hearstapps.com/amv-prod-cad-assets.s3.amazonaws.com/images/17q1/674167/2017-audi-rs7-performance-test-review-car-and-driver-photo-675400-s-original.jpg?crop=1xw:1xh;center,center&"));
    }

    private void loadOffroadCars() {

        offroadCars = new ArrayList<>();
        offroadCars.add(new Car("Chevrolet", "Colorado", "120", "2016", ""));
        offroadCars.add(new Car("Ford", "Raptor", "120", "2016", ""));
        offroadCars.add(new Car("GMC", "Sierra", "120", "2016", ""));
        offroadCars.add(new Car("Jeep", "Wrangler", "120", "2016", ""));
    }

    @Override
    public void addSportCar(Car car) {
        this.sportCars.add(car);
    }

    @Override
    public void addOffroadCar(Car car) {
        this.offroadCars.add(car);

    }
}
