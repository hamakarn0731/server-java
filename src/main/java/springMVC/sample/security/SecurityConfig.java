package springMVC.sample.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

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
}
