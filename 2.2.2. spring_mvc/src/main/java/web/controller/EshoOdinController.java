package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class EshoOdinController {
    @Autowired
    private CarDao carDao;

    @GetMapping
    public String getCarsForNumber(@RequestParam(value = "count",required = false) Integer a, Model model) {
        if(a==null){model.addAttribute("caris", carDao.all());}
        else {
        model.addAttribute("caris", carDao.index(a));}
        return "cars";
    }

}
