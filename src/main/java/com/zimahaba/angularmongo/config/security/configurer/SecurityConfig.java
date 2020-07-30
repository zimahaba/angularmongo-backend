package com.zimahaba.angularmongo.config.security.configurer;

import com.zimahaba.angularmongo.config.security.configurer.LocalWebSecurity;
import com.zimahaba.angularmongo.config.security.configurer.MemoryWebSecurity;
import com.zimahaba.angularmongo.config.security.configurer.WebSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Loads web security according to the spring profile.
 */
@Configuration
public class SecurityConfig {

    @Profile("dsec")
    @EnableWebSecurity
    public static class RemoteSecurity extends WebSecurity {}

    @Profile("msec")
    @EnableWebSecurity
    public static class MemorySecurity extends MemoryWebSecurity {}

    @Profile("lsec")
    @EnableWebSecurity
    public static class LocalSecurity extends LocalWebSecurity {}
}
