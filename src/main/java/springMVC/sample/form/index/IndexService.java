package springMVC.sample.form.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.sample.form.AbstractSampleService;

@Service
public class IndexService extends AbstractSampleService<IndexForm> {

    @Autowired
    private IndexForm form;

    @Override
    public IndexForm getForm() {
        return this.form;
    }

}
