package springMVC.sample.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import springMVC.sample.form.error.ErrorForm;

/**
 * コントロールクラスの継承用
 *
 */
public abstract class AbstractSampleController {

    @Autowired
    protected ErrorForm error;

    /**
     *
     * エラーが起こった時にエラー画面へ遷移する
     *
     * @param model
     * @param e
     * @return
     */
    @ExceptionHandler(Throwable.class)
    public String ThrowableHandler(Model model, Throwable e) {
        error.setMessage(e.getMessage());
        model.addAttribute(error);
        return error.getName();
    }
}
