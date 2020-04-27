package springMVC.sample.security;

import org.seasar.doma.jdbc.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import springMVC.sample.repositories.dao.SampleUserDetailsDao;

@Component
public class SampleUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SampleUserDetailsDao dao;
    @Autowired
    private Config config;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("".equals(username))
            throw new UsernameNotFoundException("");

        SampleUserDetails userModel = config.getTransactionManager().required(() -> {
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
