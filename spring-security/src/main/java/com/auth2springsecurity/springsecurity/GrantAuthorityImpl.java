package com.auth2springsecurity.springsecurity;

import org.springframework.security.core.GrantedAuthority;

public class GrantAuthorityImpl implements GrantedAuthority {

    String authority;

    public GrantAuthorityImpl(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}