package springMVC.sample.form.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.sample.form.AbstractSampleController;
import springMVC.sample.form.index.IndexForm;

@Controller
public class TestController extends AbstractSampleController {

    @Autowired
    TestService service;

    @RequestMapping(value = "/test", method = { RequestMethod.POST, RequestMethod.GET })
    public String test(Model model, @ModelAttribute IndexForm index) {
        service.initialize(model);
        service.setText("Hello", "");
        return service.getViewName();
    }
}
