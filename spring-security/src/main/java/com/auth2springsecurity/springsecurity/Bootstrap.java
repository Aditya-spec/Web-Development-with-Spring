package com.auth2springsecurity.springsecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Bootstrap implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        if (userRepository.count() < 1) {
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

            Roles roleAdmin = new Roles();
            Roles roleUser = new Roles();
            Roles rolePremium = new Roles();

            roleUser.setRole("ROLE_USER");
            roleAdmin.setRole("ROLE_ADMIN");
            rolePremium.setRole("ROLE_PREMIUM");

            User admin = new User();
            admin.setUsername("admin");
            admin.setRole(roleAdmin);
            admin.setRole(roleUser);

            User user = new User();
            user.setUsername("user");
            user.setRole(roleUser);

            User premium = new User();
            premium.setUsername("premium");
            premium.setRole(rolePremium);

            user.setPassword(passwordEncoder.encode("pass"));
            admin.setPassword(passwordEncoder.encode("pass"));
            premium.setPassword(passwordEncoder.encode("pass"));

            premium.setPassword(passwordEncoder.encode("pass"));


            userRepository.save(user);
            userRepository.save(admin);
            userRepository.save(premium);
            System.out.println("Total users saved::" + userRepository.count());

        }
    }
}
