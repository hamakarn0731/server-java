package springMVC.sample.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import springMVC.sample.AppConfig;
import springMVC.sample.repositories.dao.SampleUserDetailsDao;
import springMVC.sample.repositories.dao.SampleUserDetailsDaoImpl;

@Component
public class SampleUserDetailsServiceImpl implements UserDetailsService {

    private SampleUserDetailsDao dao = new SampleUserDetailsDaoImpl();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("".equals(username))
            throw new UsernameNotFoundException("");

        SampleUserDetails userModel = AppConfig.singleton().getTransactionManager().required(() -> {
            return dao.selectById(username);
        });

        // ユーザが存在しない場合
        if (userModel == null)
            throw new UsernameNotFoundException("");
        // アカウントの有効期限切れ、アカウントのロック、パスワードの有効期限切れ、ユーザの無効を判定
        if (!userModel.isAccountNonExpired() || !userModel.isAccountNonLocked() ||
                !userModel.isCredentialsNonExpired() || !userModel.isEnabled())
            throw new UsernameNotFoundException("");
        return userModel;
    }

}
