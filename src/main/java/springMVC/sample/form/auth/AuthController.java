package springMVC.sample.form.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.sample.form.AbstractSampleController;

/**
 * ログイン画面のコントローラー
 *
 */
@Controller
public class AuthController extends AbstractSampleController {

    @RequestMapping(value = "/auth", method = { RequestMethod.GET, RequestMethod.POST })
    public String auth(Model model) {
        return "auth";
    }
}
