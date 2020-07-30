package com.zimahaba.angularmongo.config.security.configurer;

import com.zimahaba.angularmongo.config.security.configurer.WebSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MemoryWebSecurity extends WebSecurity {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("zimahaba").password(bCryptPasswordEncoder.encode("admin")).roles("admin");
    }
}
