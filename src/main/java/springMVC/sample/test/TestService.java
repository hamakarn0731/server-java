package springMVC.sample.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springMVC.sample.AbstractSampleForm;
import springMVC.sample.AbstractSampleService;
import springMVC.sample.index.IndexForm;

@Service
public class TestService extends AbstractSampleService {

    @Autowired
    private TestForm form;

    @Override
    public void initialize(Model model) {
        super.initialize(model);
    }

    @Override
    protected AbstractSampleForm getForm() {
        return this.form;
    }

    public void setText(IndexForm index) {
        form.setText(index.getButton() == null ? "" : index.getText() + "テスト");
        form.setText2(index.getButton2() == null ? "" : index.getText2() + "テスト");
    }
}
