package com.DrinksStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private AuthDao authDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean getUserDetails(LoginRequestDto requestDto) {
        Object obj = authDao.getUserDetails(requestDto);
        return obj != null;
    }

    @Override
    public void generatePasswordHash() {
            System.out.println(
                    passwordEncoder.encode("reddy")
            );
    }
}
