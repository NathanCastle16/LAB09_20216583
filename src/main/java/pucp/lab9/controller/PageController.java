package pucp.lab9.controller;

@Controller
public class PageController {
    @GetMapping ("/")
    public String index(){
        return "index";
    }
}
