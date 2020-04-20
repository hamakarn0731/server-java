package springMVC.sample.index;

import org.springframework.stereotype.Component;

import springMVC.sample.AbstractSampleForm;

@Component
public class IndexForm extends AbstractSampleForm {

    private String text;
    private String button;
    private String text2;
    private String button2;

    @Override
    public String getName() {
        return "index";
    }

    //以下setter、getter
    public String getText() {
        return text;
    }

    public String getButton() {
        return button;
    }

    public String getText2() {
        return text2;
    }

    public String getButton2() {
        return button2;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public void setButton2(String button2) {
        this.button2 = button2;
    }
}
