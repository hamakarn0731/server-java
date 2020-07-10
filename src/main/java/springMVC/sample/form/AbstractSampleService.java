package springMVC.sample.form;

import org.springframework.ui.Model;

/**
 * サービスクラスの継承用
 *
 */
public abstract class AbstractSampleService<Form extends AbstractSampleForm> {

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
    public void initialize(Model model) {
        model.addAttribute(this.getForm());
    }

    /**
    *
    * 対応するform
    *
    * @return
    */
    public abstract Form getForm();
}
