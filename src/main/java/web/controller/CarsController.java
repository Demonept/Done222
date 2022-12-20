package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String cars(ModelMap model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("porche", 1993, 320));
        cars.add(new Car("nissan", 2017, 340));
        cars.add(new Car("dodge", 2022, 150));
        cars.add(new Car("bmw", 2007, 270));
        cars.add(new Car("wolksvagen", 2011, 532));
        model.addAttribute("cars", cars);


        return "cars";

    }


}