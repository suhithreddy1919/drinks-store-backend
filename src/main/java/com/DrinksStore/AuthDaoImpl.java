package com.DrinksStore;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class AuthDaoImpl implements AuthDao{
    private static final Logger log = LoggerFactory.getLogger(DrinksStoreDaoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Object getUserDetails(LoginRequestDto requestDto) {
        UserData user = entityManager.createQuery(
                        "FROM UserData WHERE username = :username",
                        UserData.class
                )
                .setParameter("username", requestDto.getUserName())
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);

        if (user == null ||
                !passwordEncoder.matches(
                        requestDto.getPassword(),
                        user.getPassword())) {
            return null;
        }
        return user;
    }
}
