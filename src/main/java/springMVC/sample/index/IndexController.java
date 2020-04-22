package springMVC.sample.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.sample.AbstractSampleController;

/**
 * 初期表示用のコントローラー
 *
 */
@Controller
public class IndexController extends AbstractSampleController {

    @Autowired
    IndexService service;
    @Autowired
    IndexForm form;

    @RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
    public String index(Model model) {
        service.initialize(model, form);
        return service.getViewName();
    }
}
