package springMVC.sample.form.test;

import org.springframework.stereotype.Component;

import springMVC.sample.form.AbstractSampleForm;

@Component
public class TestForm extends AbstractSampleForm {

    private String text;
    private String text2;

    @Override
    public String getName() {
        return "test";
    }

    //以下setter、getter
    public String getText() {
        return text;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText2() {
        return text2;
    }

    public void setText(String text) {
        this.text = text;
    }
}
