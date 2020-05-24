package com.dipankar.securityjpa.services;

import com.dipankar.securityjpa.models.LoginUserDetails;
import com.dipankar.securityjpa.models.User;
import com.dipankar.securityjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByUserName(userName);
        userOptional.orElseThrow(() -> new UsernameNotFoundException("User Not Found: " + userName));
        return userOptional.map(LoginUserDetails::new).get();
    }
}
