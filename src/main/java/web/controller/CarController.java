package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        model.addAttribute("carList",carService.getCars(count.orElse(0)));
        return "cars";
    }
}
