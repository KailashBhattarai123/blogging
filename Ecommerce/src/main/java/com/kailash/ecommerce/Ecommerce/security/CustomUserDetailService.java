package com.kailash.ecommerce.Ecommerce.security;

import com.kailash.ecommerce.Ecommerce.entities.User;
import com.kailash.ecommerce.Ecommerce.exceptions.ResourceNotFoundException;
import com.kailash.ecommerce.Ecommerce.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //loading user from database by username
        User user = this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User ", " email : "+username, 0));

        return null;
    }
}
