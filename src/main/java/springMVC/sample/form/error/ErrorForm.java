package springMVC.sample.form.error;

import org.springframework.stereotype.Component;

import springMVC.sample.form.AbstractSampleForm;

/**
 *
 * エラー用のフォーム
 *
 */
@Component
public class ErrorForm extends AbstractSampleForm {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getName() {
        return "error";
    }

}
