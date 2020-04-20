package springMVC.sample;

import org.springframework.ui.Model;

/**
 * サービスクラスの継承用
 *
 */
public abstract class AbstractSampleService {

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
     * 対応するform
     *
     * @return
     */
    protected abstract AbstractSampleForm getForm();

    /**
     *
     * 初期化用
     * formをmodelに登録
     *
     * オーバーライドしてhtmlの初期化を書く
     * super.initialize(model);
     * を書く
     *
     * @param model
     */
    public void initialize(Model model) {
        model.addAttribute(getForm());
    }
}
