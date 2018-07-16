package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mehdi on 5/23/18.
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "mehdi");
        return "index";
    }
}
