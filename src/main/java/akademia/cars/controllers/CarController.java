package akademia.cars.controllers;

import akademia.cars.model.Car;
import akademia.cars.services.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/sport")
    public String getCarsSport(Model model) {
        model.addAttribute("cars", carService.getSportCars());
        return "sport-cars";
    }

    @GetMapping("/offroad")
    public String getCarsOffroad(Model model) {
        model.addAttribute("cars", carService.getOffroadCars());
        return "offroad-cars";
    }

    @PostMapping("/add/sport")
    public String addSport(@Valid @ModelAttribute  Car car) {
        carService.addSportCar(car);
        return "redirect:/sport";
    }

    @PostMapping("/add/offroad")
    public String addOffroad(@Valid @ModelAttribute Car car) {

        carService.addOffroadCar(car);
        return "redirect:/offroad";
    }

    @PostMapping("/details")
    public String details(@Valid @ModelAttribute Car car) {
        System.out.println(car);
        return "redirect:/";
    }

}
