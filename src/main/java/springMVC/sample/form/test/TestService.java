package springMVC.sample.form.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.sample.form.AbstractSampleService;

@Service
public class TestService extends AbstractSampleService<TestForm> {

    @Autowired
    private TestForm form;

    public void setText(String text, String text2) {
        TestForm form = getForm();

        form.setText(text);
        form.setText2(text2);
    }

    @Override
    public TestForm getForm() {
        return this.form;
    }
}
