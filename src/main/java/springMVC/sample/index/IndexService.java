package springMVC.sample.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springMVC.sample.AbstractSampleForm;
import springMVC.sample.AbstractSampleService;

@Service
public class IndexService extends AbstractSampleService {

    @Autowired
    private IndexForm form;

    /**
     * テキストボックスにhello world
     */
    @Override
    public void initialize(Model model) {
        super.initialize(model);
        form.setText("hello");
        form.setText2("world");
    }

    @Override
    protected AbstractSampleForm getForm() {
        return this.form;
    }
}
