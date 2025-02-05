package com.ankit.the_java_academy_bank.service;

import com.ankit.the_java_academy_bank.dto.BankResponse;
import com.ankit.the_java_academy_bank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    
}
