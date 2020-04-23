package springMVC.sample.form.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.sample.AppConfig;
import springMVC.sample.form.AbstractSampleController;
import springMVC.sample.form.index.IndexForm;
import springMVC.sample.repositories.UserInfo;
import springMVC.sample.repositories.dao.AuthDummyDao;
import springMVC.sample.repositories.dao.AuthDummyDaoImpl;

@Controller
public class TestController extends AbstractSampleController {

    @Autowired
    TestService service;
    @Autowired
    TestForm form;

    @RequestMapping(value = "/test", method = { RequestMethod.POST, RequestMethod.GET })
    public String test(Model model, @ModelAttribute IndexForm index) {
        AuthDummyDao dao = new AuthDummyDaoImpl();
        UserInfo user = AppConfig.singleton().getTransactionManager().required(()->{
            UserInfo tmp;
            try {
                tmp = dao.selectById("AA");
            }catch (Exception e){
                System.out.println(e);
                tmp = new UserInfo();
            }
            return tmp;
        });

        service.initialize(model, form);
        service.setText("Hello", user.getPassword());
        return service.getViewName();
    }
}
