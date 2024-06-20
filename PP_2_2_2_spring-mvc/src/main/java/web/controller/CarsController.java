package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


import javax.servlet.http.HttpServletRequest;


@Controller
public class CarsController {
    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carsPage(HttpServletRequest request, Model model) {
        int count;
        if (request.getParameter("count") != null) {
            count = Integer.parseInt(request.getParameter("count"));
        } else {
            count = 5;
        }
        ;
        model.addAttribute("cars", carService.getListCar(count));
        return "cars";
    }

    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getListCar(count));
        return "cars";
    }
}
