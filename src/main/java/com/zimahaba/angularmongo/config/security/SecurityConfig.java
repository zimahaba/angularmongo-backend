package com.zimahaba.angularmongo.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Loads web security according to the spring profile.
 */
@Configuration
public class SecurityConfig {

    @Profile("dev")
    @EnableWebSecurity
    public static class RemoteSecurity extends WebSecurity {}

    @Profile("local")
    @EnableWebSecurity
    public static class LocalSecurity extends LocalWebSecurity {}
}
