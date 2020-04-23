package springMVC.sample.repositories.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import springMVC.sample.AppConfig;
import springMVC.sample.repositories.UserInfo;

@Dao(config = AppConfig.class)
public interface AuthDummyDao {
    @Select
    UserInfo selectById(String id);
}
