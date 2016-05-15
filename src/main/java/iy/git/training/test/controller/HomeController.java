package iy.git.training.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = {"/"}, method = {RequestMethod.GET})
    public String indexGet(Model model) {
        model.addAttribute("as", "Igor");
        model.addAttribute("as2", "Vasia");
        model.addAttribute("as2", "Vasia");
        return "index";
    }
}
