package com.br.codenation.application.service.impl;

import com.br.codenation.application.domain.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //Busque um usuário pelo username no seu banco a partir da String que chega como parametro
        //Valide se e nulo
        throw new UsernameNotFoundException(s);
    }

    private final static class UserRepositoryDetails extends User implements UserDetails{
        private static final long serialVersionUID = 1L;

        private UserRepositoryDetails(User user){
            super(user);
        }

        @Override
        public Collection<GrantedAuthority> getAuthorities() {
            return super.getAuthorities();
        }

        @Override
        public String getPassword() {
            return super.getPassword();
        }

        @Override
        public String getUsername() {
            return super.getUsername();
        }

        @Override
        public boolean isEnabled() {
            return super.isEnabled();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return super.isAccountNonLocked();
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return super.isCredentialsNonExpired();
        }

        @Override
        public void eraseCredentials() {
            super.eraseCredentials();
        }

        @Override
        public boolean equals(Object rhs) {
            return super.equals(rhs);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
