package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService){
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String cars(ModelMap model){
        model.addAttribute("cars", carService.getAll());
        return "cars";
    }
    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model){
        model.addAttribute("cars", carService.getSome(count));
        return "cars";
    }


}