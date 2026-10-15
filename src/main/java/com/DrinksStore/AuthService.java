package com.DrinksStore;

public interface AuthService {
    boolean getUserDetails(LoginRequestDto requestDto);
    public void generatePasswordHash();
}
