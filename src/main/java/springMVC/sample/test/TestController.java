package springMVC.sample.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.sample.AbstractSampleController;
import springMVC.sample.index.IndexForm;

@Controller
public class TestController extends AbstractSampleController {

    @Autowired
    TestService service;
    @Autowired
    TestForm form;

    @RequestMapping(value = "/test", method = { RequestMethod.POST, RequestMethod.GET })
    public String test(Model model, @ModelAttribute IndexForm index) {
        service.initialize(model, form);
        service.setText("Hello", "World");
        return service.getViewName();
    }
}
