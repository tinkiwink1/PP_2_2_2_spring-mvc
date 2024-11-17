package web.controller;


import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford", "USA", 2005));
        list.add(new Car("Honda", "JAPAN", 2006));
        list.add(new Car("Chevrolet", "USA", 2007));
        list.add(new Car("FIAT", "ITALIA", 1999));
        list.add(new Car("BMW", "GERMAN", 2020));

        list = CarServiceImpl.carsCount(list, allCars);

        model.addAttribute("list", list);

        return "cars";
    }

}
