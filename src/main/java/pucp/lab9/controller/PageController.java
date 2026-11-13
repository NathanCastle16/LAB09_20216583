package pucp.lab9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.binf.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping ("/")
    public String index(){
        return "index";
    }
}
