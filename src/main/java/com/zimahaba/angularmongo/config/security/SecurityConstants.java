package com.zimahaba.angularmongo.config.security;

public class SecurityConstants {
    public static final String SECRET = "secret";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String SIGN_UP_URL = "/signup";
}
