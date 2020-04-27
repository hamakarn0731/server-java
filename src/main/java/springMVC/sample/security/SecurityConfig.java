package springMVC.sample.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/auth", "/error").permitAll()
                .anyRequest().authenticated();

        http.formLogin()
                .loginPage("/auth")
                .loginProcessingUrl("/authenticate")
                .defaultSuccessUrl("/")
                .failureUrl("/auth")
                .usernameParameter("userid")
                .passwordParameter("password");

        http.logout()
                .logoutSuccessUrl("/");
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        // テストのためパスワードの暗号化はしない
        return passwordEncoder;
    }
}
