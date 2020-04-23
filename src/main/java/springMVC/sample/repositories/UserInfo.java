package springMVC.sample.repositories;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class UserInfo {

    @Id
    String id;

    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
