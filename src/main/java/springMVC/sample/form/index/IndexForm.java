package springMVC.sample.form.index;

import org.springframework.stereotype.Component;

import springMVC.sample.form.AbstractSampleForm;

@Component
public class IndexForm extends AbstractSampleForm {

    private String button;

    @Override
    public String getName() {
        return "index";
    }

    //以下setter、getter

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
}
