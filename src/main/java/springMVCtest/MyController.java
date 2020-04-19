package springMVCtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model mav) {
        mav.addAttribute("text", "hello world");
        return "test";
    }
}
