package springMVC.sample;

import org.springframework.ui.Model;

/**
 * サービスクラスの継承用
 *
 */
public abstract class AbstractSampleService<Form extends AbstractSampleForm> {

    Form form;

    /**
     *
     * 対応するhtmlの名前
     *
     */
    public String getViewName() {
        return getForm().getName();
    }

    /**
     *
     * 初期化用
     * formをmodelに登録
     *
     * オーバーライドしてhtmlの初期化を書く
     * super.initialize(model);
     * を書く
     * @param <T>
     *
     * @param model
     */
    public void initialize(Model model, Form form) {
        model.addAttribute(form);
        setForm(form);
    }

    /**
    *
    * 対応するform
    *
    * @return
    */
    public Form getForm() {
        return form;
    }

    protected void setForm(Form form) {
        this.form = form;
    }
}
