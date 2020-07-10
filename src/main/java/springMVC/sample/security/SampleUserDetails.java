package springMVC.sample.security;

import java.util.Collection;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class SampleUserDetails implements UserDetails {

    @Id
    private String id;

    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getUsername() {
        return this.getId();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    //以下setter、getter
    public String getId() {
        return id;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
