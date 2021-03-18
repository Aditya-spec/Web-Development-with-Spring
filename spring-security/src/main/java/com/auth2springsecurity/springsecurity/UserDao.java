package com.auth2springsecurity.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;

    AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if (username != null) {
            List<Hasroles> roles = user.getRoles();
            List<GrantAuthorityImpl> grantAuthorities = new ArrayList<>();

            for (Hasroles userRole : roles) {
                grantAuthorities.add(new GrantAuthorityImpl(userRole.getRole()));
            }
            return new AppUser(user.getUsername(), user.getPassword(), grantAuthorities);
        } else {
            throw new RuntimeException();
        }

    }
}
