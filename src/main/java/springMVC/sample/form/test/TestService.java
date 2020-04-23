package springMVC.sample.form.test;

import org.springframework.stereotype.Service;

import springMVC.sample.form.AbstractSampleService;

@Service
public class TestService extends AbstractSampleService<TestForm> {

    public void setText(String text, String text2) {
        TestForm form = getForm();

        form.setText(text);
        form.setText2(text2);
    }
}