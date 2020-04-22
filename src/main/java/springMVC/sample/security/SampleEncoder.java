package springMVC.sample.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * 無変換
 *
 */
public class SampleEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        if (rawPassword == null) {
            return "null";
        }
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}
