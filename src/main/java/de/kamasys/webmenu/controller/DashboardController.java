package de.kamasys.webmenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping(value = "/")
    public String index() {
        return "dashboard/index";
    }
}
