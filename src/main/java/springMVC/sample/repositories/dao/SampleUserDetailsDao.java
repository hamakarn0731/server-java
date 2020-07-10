package springMVC.sample.repositories.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import springMVC.sample.security.SampleUserDetails;

@Dao
public interface SampleUserDetailsDao {
    @Select
    SampleUserDetails selectById(String id);
}
